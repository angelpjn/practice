import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame { // â Ʋ �����
	public MyFrame( ) {
		super("BoLayout Demo");
		setLayout(new BorderLayout(20, 10));
		JPanel panel = new JPanel( ); // �гο� 5�� ������Ʈ ���̱�
		panel.add(new JButton("1"), BorderLayout.EAST);
		panel.add(new JButton("2"), BorderLayout.SOUTH);
		panel.add(new JButton("3"), BorderLayout.WEST);
		panel.add(new JButton("4"), BorderLayout.NORTH);
		panel.add(new JButton("5"), BorderLayout.CENTER);

		JPanel panel2 = new JPanel( );
		panel9.setBackground(Color.GREEN);
		panel9.add(new JLabel("Layout"), BorderLayout.CENTER);

		add(panel, BorderLayout.CENTER); // �߾ӿ� �г� ���̱�
		add(panel2, BorderLayout.NORTH); // ���ʿ� �ٸ� �г� ���̱�
		setSize(450, 200);
		setVisible(true);
	}
}

public class MyFrame6 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}