import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame { // â Ʋ �����
	JLabel label = new JLabel("�̸�"); // 3���� ������Ʈ
	JButton button = new JButton("Ȯ��");
	JTextField textfield = new JTextField(20);

	public MyFrame( ) {
		setLayout(new FlowLayout( ));
		add(label); // ���̺� �߰��Ͽ� ��ġ�ϱ�
		add(textfield); // �ؽ�Ʈ�ʵ�
		add(button); // ��ư
		setSize(300, 100); // â ũ��
		setVisible(true); // â ���
	}
}

public class MyFrame4 {
	public static void main(String[ ] args) {
		JFrame frime = new MyFrame( );
	}
}