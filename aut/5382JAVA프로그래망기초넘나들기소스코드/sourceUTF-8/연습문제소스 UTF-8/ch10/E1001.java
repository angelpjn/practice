import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

class MyGUI extends JFrame {
	MyGUI( ) {
		JButton btn = new JButton("이곳을 클릭하세요!");
		btn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭하였음 ... ");
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