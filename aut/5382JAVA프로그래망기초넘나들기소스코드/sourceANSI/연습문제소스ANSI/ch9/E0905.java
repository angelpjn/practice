import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {
	MyPanel( ) {
		this.setBackground(Color.ORANGE);
		this.setBounds(20, 20, 150, 200);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("I can do it!", 100, 30);
		System.out.println("자동으로 paintComponent 호출");
	}
}

class MyGUI extends JFrame {
	MyPanel mp;

	MyGUI( ) {
		mp = new MyPanel( );
		this.getContentPane( ).add(mp);

		setSize(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class E0905 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}