import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame { // 창 틀 만들기
	public MyFrame( ) {
		super("BorderLayout Demo");
		Container container = getContentPane( );
		container.setLayout(new BorderLayout(20, 10));
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("Center"), BorderLayout.CENTER);

		setSize(450, 200);
		setVisible(true);
	}
}

public class MyFrame2 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}