import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame implements ActionListener {

	public MyGUI( ) {
		setTitle("JButton Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon normalIcon = new ImageIcon("C:/work/image/sunset.jpg");
		ImageIcon rolloverIcon = new ImageIcon("C:/work/image/flower.jpg");
		ImageIcon pressedIcon = new ImageIcon("C:/work/image/tulip.jpg");

		JButton btn = new JButton(normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon); // (null)로 하면 제거

		btn.addActionListener(this);
		add(btn);

		setSize(300, 150);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Message", "Title",
				JOptionPane.INFORMATION_MESSAGE);
	}
}

public class Pr1102 {
	public static void main(final String args[ ]) {
		new MyGUI( );
	}
}