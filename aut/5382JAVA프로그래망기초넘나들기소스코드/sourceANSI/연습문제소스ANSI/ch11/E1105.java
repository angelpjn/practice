import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame {
	JTextField tf1, tf2, tf3;
	String msg = "";
	TextHandler handler = null;

	MyFrame( ) {
		setTitle("JTextField Demo");
		Container pane = getContentPane( );
		pane.setLayout(new GridLayout(0, 1));

		tf1 = new JTextField(15);
		// tf1.setEditable(false);
		JPanel panel1 = new JPanel( );
		panel1.add(tf1);

		tf2 = new JTextField("Sring Text");
		JPanel panel2 = new JPanel( );
		panel2.add(tf2);

		tf3 = new JTextField("Right ", 20);
		tf3.setPreferredSize(tf2.getPreferredSize( ));
		tf3.setHorizontalAlignment(JTextField.LEFT);
		JPanel panel3 = new JPanel( );
		panel3.add(tf3);

		handler = new TextHandler( );
		tf1.addActionListener(handler);

		tf3.addKeyListener(new KeyAdapter( ) {

			public void keyReleased(KeyEvent e) {
				JTextField textField = (JTextField) e.getSource( );
				String text = textField.getText( );
				textField.setText(text.toUpperCase( ));
			}

			public void keyTyped(KeyEvent e) {
				if (e.getKeyCode( ) == KeyEvent.VK_ENTER) {
					tf3.setFocusable(true); // 커서 설정
					tf3.getFocusAccelerator( );
					tf3.requestFocus( ); // 커서 이동
					if (tf3.hasFocus( )) { // 포커스를 가지고 있으면
						tf3.setText("");
					}
				}
			}

			public void keyPressed(KeyEvent e) { }
		});

		tf2.addFocusListener(new FocusListener( ) {
			public void focusGained(FocusEvent e) {
				int position = tf2.getCaretPosition( );
				tf2.setCaretPosition(position);
			}

			public void focusLost(FocusEvent e) { }
		});

		add(panel1);
		add(panel2);
		add(panel3);

		setResizable(false);
		setSize(250, 120);
		setLocationRelativeTo(null); // Center window.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		tf2.requestFocus( ); // 커서 이동
	}

	private class TextHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource( ) == tf1) {
				msg = "text : " + e.getActionCommand( );
				JOptionPane.showMessageDialog(null, msg);
			}
		}
	}
}

public class E1105 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}