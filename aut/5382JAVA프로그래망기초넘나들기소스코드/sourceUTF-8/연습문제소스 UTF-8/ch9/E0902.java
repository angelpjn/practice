import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyGUI extends JFrame {

	MyGUI() {
		Container c = getContentPane();

		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add(new JButton("1"), BorderLayout.NORTH);
		p1.add(new JButton("2"), BorderLayout.WEST);
		p1.add(new JButton("3"), BorderLayout.CENTER);
		p1.add(new JButton("4"), BorderLayout.EAST);
		p1.add(new JButton("5"), BorderLayout.SOUTH);

		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p2.add(new JButton("A"));
		p2.add(new JButton("B"));
		p2.add(new JButton("C"));
		p2.add(new JButton("D"));
		p2.add(new JButton("E"));

		c.setLayout(new BorderLayout());
		c.add(p1, BorderLayout.CENTER);
		c.add(p2, BorderLayout.EAST);

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class E0902 {
	public static void main(String[] args) {
		new MyGUI();
	}
}