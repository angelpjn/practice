import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	JTextArea ta = new JTextArea(5, 20); // 5�� * 20�� �Է� â

	public MyFrame( ) {
		setTitle("TextAreaDemo");
		ta.setText("�� ĭ�� 30��, 7�� ���� �Է�: ");
		JScrollPane sp = new JScrollPane(ta);  // ��ũ�ѹٸ� ����ϱ� ����

		JPanel jp = new JPanel( );
		jp.setLayout(new FlowLayout( ));
		jp.add(sp); // ��ũ�ѹ� ���̱�

		setContentPane(jp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack( );
		setVisible(true);
	}
}

public class E1106 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}