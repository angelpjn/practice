import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	JLabel label = new JLabel("���콺 Ŭ�� ");

	public MyGUI( ) {
		setTitle("Event Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel( );
		
		JToggleButton togBtn = new JToggleButton("Toggle");
		togBtn.addItemListener(new ItemListener( ) {
			public void itemStateChanged(ItemEvent e) {
				AbstractButton src = (AbstractButton) (e.getSource( ));
				System.out.println("��ư ��: " + src.getText( ));
			}
		});


		JButton btn = new JButton("click");
		label.addMouseListener(new MyMouseListener( ));

		panel.add(togBtn);
		panel.add(btn);
		panel.add(label);
		add(panel);

		pack( );
		setVisible(true);
		setLocationRelativeTo(null);
	}

	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			int x = e.getX( );
			int y = e.getY( );
			label.setText("��ǥ:(" + e.getX( ) + ", " + e.getY( ) + ")");
		}
	}
}

public class E1007 {
	public static void main(String args[]) {
		new MyGUI( );
	}
}