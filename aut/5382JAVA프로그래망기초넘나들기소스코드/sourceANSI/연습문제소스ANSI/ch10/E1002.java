import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	MyGUI( ) {
		JButton btn = new JButton("�̰��� Ŭ���ϼ���!");
		btn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				btn.setText("Hello");
			}
		});

		getContentPane( ).add(btn);

		pack( );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class E1002 {
	public static void main(String[] args) {
		new MyGUI( );
	}
}