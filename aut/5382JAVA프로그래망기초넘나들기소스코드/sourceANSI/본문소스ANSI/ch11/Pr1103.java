import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyGUI extends JFrame {

	public MyGUI( ) {
		setTitle("JCheckBox Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout( ));

		JCheckBox pear = new JCheckBox("��");
		pear.setSelected(true);
		JCheckBox apple = new JCheckBox("���");
		JCheckBox grape = new JCheckBox("����", true);

		add(new JLabel("����"));
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