import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {
	MyPanel( ) {
		this.setBounds(20, 20, 150, 100);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawRect(30, 20, 100, 50);		
		System.out.println("자동으로 paintComponent 호출");
	}
}

class MyGUI extends JFrame {
	MyPanel mp;

	MyGUI( ) {
		mp = new MyPanel( );
		this.getContentPane( ).add(mp);

		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class E0906 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}