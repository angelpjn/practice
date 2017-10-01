import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyGUI extends JFrame {
	JTextField tf;
	String str = "";
	TextHandler handler = null;

	private class TextHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource( ) == tf) {
				str = "입력 내용 : " + e.getActionCommand( );
				JOptionPane.showMessageDialog(null, str);
			}
		}
	}

	MyGUI( ) {
		super("TextField Demo");
		setLayout(new FlowLayout( ));
		tf = new JTextField(10);

		add(tf);
		handler = new TextHandler( );
		tf.addActionListener(handler);

		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class E1004 {
	public static void main(String[] args) {
		new MyGUI( );
	}
}