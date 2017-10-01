import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyGUI extends JFrame {
	public MyGUI( ) {
		initUI( );
	}

	public final void initUI( ) {
		JButton btn1 = new JButton("Click");
		JButton btn2 = new JButton("Action");
		btn1.setBounds(30, 20, 100, 30);
		btn2.setBounds(150, 20, 100, 30);

		getContentPane( ).setLayout(null);
		getContentPane( ).add(btn1);
		getContentPane( ).add(btn2);

		btn1.addActionListener(new MyActionLisner( ));
		btn2.addActionListener(new MyActionLisner( ));

		setSize(300, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class MyActionLisner implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource( );
			if (btn.getText( ).equals("Click"))
				btn.setText("someEvent");
			else
				btn.setText("Click");
		}
	}
}

public class EventApp2 {
	public static void main(String[] args) {
		new MyGUI( );
	}
}