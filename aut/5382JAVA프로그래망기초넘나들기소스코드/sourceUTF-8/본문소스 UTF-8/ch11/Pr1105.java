import java.awt.*;
import java.awt.event.*;
 

import javax.swing.*;
import javax.swing.event.*;

class MyGUI extends JFrame {

	public MyGUI( ) {
		setTitle("JRadioButton Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new GridLayout(0, 1));

		JRadioButton btn1 = new JRadioButton("상");
		JRadioButton btn2 = new JRadioButton("중");
		JRadioButton btn3 = new JRadioButton("하");
		ButtonGroup group = new ButtonGroup( );
		group.add(btn1);
		group.add(btn2);
		group.add(btn3);
		btn1.setSelected(true);

		ActionListener actionListener = new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				AbstractButton aButton = (AbstractButton) e.getSource( );
				String str = aButton.getText( );
				JOptionPane.showMessageDialog(null, str, "Title",
						JOptionPane.INFORMATION_MESSAGE);
			}
		};
		btn2.addActionListener(actionListener);

		btn3.addItemListener(new ItemListener( ) {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Checked? " + btn3.isSelected( ));
			}
		});

		ChangeListener changeListener = new ChangeListener( ) {
			public void stateChanged(ChangeEvent e) {
				AbstractButton abtn = (AbstractButton) e.getSource( );
				ButtonModel btnModel = abtn.getModel( );
				boolean armed = btnModel.isArmed( );
				boolean pressed = btnModel.isPressed( );
				boolean selected = btnModel.isSelected( );
				System.out.println("Changed: " + armed + "/" + pressed + "/"
						+ selected);
			}
		};
		btn1.addChangeListener(changeListener);

		panel.add(new JLabel("등급:"));
		panel.add(btn1);
		panel.add(btn2);

		panel.add(btn3);
		add(panel);

		setSize(250, 200);
		setVisible(true);
	}
}

public class Pr1105 {
	public static void main(final String args[ ]) {
		new MyGUI( );
	}
}