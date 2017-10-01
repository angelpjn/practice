import javax.swing.JFrame;
import javax.swing.JLabel;

class MyGUI extends JFrame {
	MyGUI( ) {
		setTitle("Swing Code");

		JLabel label = new JLabel("Good");
		getContentPane( ).add(label);

		setSize(250, 80);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class E0901 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}