import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	JTextField t, tf;
	JTextArea ta;

	public MyGUI( ) {
		setTitle("JTextArea Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout( ));

		tf = new JTextField(20);
		ta = new JTextArea(5, 10); // 5�� x 10ĭ
		ta.setPreferredSize(new Dimension(100, 100));

		tf.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				t = (JTextField) e.getSource( ); // �Է� ����
				ta.append(t.getText( ) + "\n"); // �����̱�
				t.setText(""); // �ؽ�Ʈ�ʵ� ���� �����
			}
		});
		
		add(new JLabel("����:"));
		add(tf);
		add(new JScrollPane(ta, 
                      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			              JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
		ta.setLineWrap(true);
	
		setSize(300, 200);
		setVisible(true);
	}
}

public class Pr1107 {
	public static void main(final String args[ ]) {
		new MyGUI( );
	}
}