import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

class MyGUI extends JFrame {
	MyGUI( ) {
		JButton btn = new JButton("�̰��� Ŭ���ϼ���!");
		btn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư Ŭ���Ͽ��� ... ");
			}
		});

		getContentPane( ).add(btn);

		pack( );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class E1001 {
	public static void main(String[] args) {
		new MyGUI( );
	}
}