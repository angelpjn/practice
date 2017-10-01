import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {  
	public MyFrame( ) {
		setTitle("Absolute Layout Demo");
		JPanel contentPane = new JPanel( );
		contentPane.setOpaque(true);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null); // 배치관리자 제거, 절대위치에 배치

		JLabel label = new JLabel("Absolute Position ...",
				JLabel.CENTER);
		label.setBounds(10, 5, 300, 30); // setBounds(x, y, width, height);

		JButton button = new JButton("I can do it.");
		button.setBounds(105, 40, 100, 30);

		contentPane.add(label);
		contentPane.add(button);

		setContentPane(contentPane);
		setSize(310, 125);
		setVisible(true);
	}
}
public class MyFrame10 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}