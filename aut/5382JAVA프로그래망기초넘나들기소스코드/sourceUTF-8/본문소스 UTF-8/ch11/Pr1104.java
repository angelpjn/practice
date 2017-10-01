import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {

	public MyGUI( ) {
		setTitle("JCheckBox Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout( ));

		JCheckBox pear = new JCheckBox("배");
		pear.setSelected(true);
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox grape = new JCheckBox("포도", true);

		ActionListener actionListener = new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				apple.setText("귤");
			}
		};
		apple.addActionListener(actionListener);

		grape.addItemListener(new ItemListener( ) {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Checked? " + grape.isSelected( ));
			}
		});

		add(new JLabel("과일"));
		add(pear);
		add(apple);
		add(grape);

		setSize(250, 100);
		setVisible(true);
	}
}

public class Pr1104 {
	public static void main(final String args[ ]) {
		new MyGUI( );
	}
}