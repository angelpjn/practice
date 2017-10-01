import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame { // 창 틀 만들기
	public MyFrame( ) {
		super("FlowLayout Demo");
		Container container = getContentPane( );
		container.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
		for (int i = 1; i <= 5; i++)
			container.add(new JButton("Component " + i));

		setSize(450, 150);
		setVisible(true);
	}
}

public class MyFrame5 {
	public static void main(String[ ] args) {
		JFrame frame = new MyFrame( );
	}
}