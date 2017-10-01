import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame { // 창 틀 만들기
	public MyFrame( ) {
		super("BoLayout Demo");
		setLayout(new BorderLayout(20, 10));
		JPanel panel = new JPanel( ); // 패널에 5개 컴포넌트 붙이기
		panel.add(new JButton("1"), BorderLayout.EAST);
		panel.add(new JButton("2"), BorderLayout.SOUTH);
		panel.add(new JButton("3"), BorderLayout.WEST);
		panel.add(new JButton("4"), BorderLayout.NORTH);
		panel.add(new JButton("5"), BorderLayout.CENTER);

		JPanel panel2 = new JPanel( );
		panel2.setBackground(Color.GREEN);
		panel2.add(new JLabel("Layout"), BorderLayout.CENTER);

		add(panel, BorderLayout.CENTER); // 중앙에 패널 붙이기
		add(panel2, BorderLayout.NORTH); // 위쪽에 다른 패널 붙이기
		setSize(450, 200);
		setVisible(true);
	}
}

public class MyFrame6 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}