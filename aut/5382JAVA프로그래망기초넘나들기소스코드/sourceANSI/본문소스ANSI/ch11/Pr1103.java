import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyGUI extends JFrame {

	public MyGUI( ) {
		setTitle("JCheckBox Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout( ));

		JCheckBox pear = new JCheckBox("배");
		pear.setSelected(true);
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox grape = new JCheckBox("포도", true);

		add(new JLabel("과일"));
		add(pear);
		add(apple);
		add(grape);

		setSize(250, 100);
		setVisible(true);
	}
}

public class Pr1103 {
	public static void main(final String args[ ]) {
		new MyGUI( );
	}
}