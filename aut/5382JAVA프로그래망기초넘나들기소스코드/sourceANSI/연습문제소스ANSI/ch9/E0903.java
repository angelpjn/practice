import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class MyGUI extends JFrame {
	MyGUI( ) {
		setLayout(new BorderLayout(10, 10));
		Container c = getContentPane( );
		JPanel top = new JPanel( );
		top.setBorder(new LineBorder(Color.BLUE, 3, true));

		JPanel bottom = new JPanel( );
		bottom.setBorder(new BevelBorder(EtchedBorder.RAISED));

		JPanel left = new JPanel( );
		left.setBorder(new EtchedBorder(BevelBorder.LOWERED));

		JPanel right = new JPanel( );
		right.setBorder(new MatteBorder(1, 5, 1, 1, Color.RED));

		JPanel center = new JPanel( );
		center.setBorder(new BevelBorder(BevelBorder.RAISED));

		c.add(top, BorderLayout.NORTH);
		c.add(bottom, BorderLayout.SOUTH);
		c.add(left, BorderLayout.WEST);
		c.add(right, BorderLayout.EAST);
		c.add(center, BorderLayout.CENTER);

		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class E0903 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}