import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyGUI extends JFrame implements ActionListener {

	MyGUI( ) {
		setTitle("Event Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout( ));
		JPanel panel = new JPanel( );
		JButton nameBtn = new JButton("�̸�");
		JTextField tf = new JTextField(12);
		JSlider slider = new JSlider( ); // �����̴�
		BoundedRangeModel model = slider.getModel( ); // ���� ����

		panel.add(nameBtn); // �гο� ���̱�
		panel.add(slider);
		panel.add(tf);
		add(panel); // �����ӿ� �г� ���̱�

		tf.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Text=" + tf.getText( ));
			}
		});

		model.addChangeListener(new ChangeListener( ) {
			public void stateChanged(ChangeEvent e) {
				int result = model.getValue( );
				tf.setText("�����̴� ��: " + Integer.toString(result));
			}
		});

		pack( );
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand( );
	}
}

public class E1006 {
	public static void main(String args[]) {
		new MyGUI( );
	}
}