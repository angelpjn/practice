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
		JButton nameBtn = new JButton("이름");
		JTextField tf = new JTextField(12);
		JSlider slider = new JSlider( ); // 슬라이더
		BoundedRangeModel model = slider.getModel( ); // 범위 제한

		panel.add(nameBtn); // 패널에 붙이기
		panel.add(slider);
		panel.add(tf);
		add(panel); // 프레임에 패널 붙이기

		tf.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Text=" + tf.getText( ));
			}
		});

		model.addChangeListener(new ChangeListener( ) {
			public void stateChanged(ChangeEvent e) {
				int result = model.getValue( );
				tf.setText("슬라이더 값: " + Integer.toString(result));
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