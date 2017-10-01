import java.awt.*;
import javax.swing.*;

class MyGUI extends JFrame {
	MyGUI( ) {
		JLabel label = new JLabel("Text Color: »¡°­");
		JTextField ta = new JTextField("Input ...");

		label.setForeground(Color.red);
		Font font = new Font("Verdana", Font.BOLD, 12);
		ta.setFont(font);
		ta.setForeground(Color.BLUE);

		setLayout(new FlowLayout( ));
		add(label);
		add(ta);

		pack( );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}

public class E0904 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}