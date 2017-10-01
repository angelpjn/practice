import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {

	public MyGUI( ) {
		setTitle("Event Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout( ));

		designUI( );

		pack( );
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public void designUI( ) {
		JPanel panel = new JPanel( );
		JTextField tf1 = new JTextField(15);
		JTextField tf2 = new JTextField(20);
		tf2.setEditable(false);

		panel.add(new JLabel("¼ýÀÚ ÀÔ·Â: "), BorderLayout.WEST);
		panel.add(tf1, BorderLayout.CENTER);
		panel.add(tf2, BorderLayout.SOUTH);

		JButton btn = new JButton("°ö¼À");
		btn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				String numberStr = tf1.getText( );
				numberStr = numberStr.trim( );
				double n = Double.parseDouble(numberStr);
				tf2.setText(n + " * 2 = "
						+ String.format("%.2f", n *= 2));
			}
		});
		panel.add(btn, BorderLayout.EAST);
		add(panel);
	}
}

public class E1008 {
	public static void main(String args[]) {
		new MyGUI( );
	}
}