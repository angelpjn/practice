import java.awt.*;
import javax.swing.*;

class MyGUI extends JFrame {
	public MyGUI( ) { // MyGUI Ŭ������ ���� ������(��ü ���� �뵵)
		setTitle("JLabel Demo"); // Ÿ��Ʋ
		setLayout(new FlowLayout( )); // ������Ʈ ��ġ ���

		setSize(250, 150); // ������ ũ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â ����
		setVisible(true); // ȭ�鿡 ���̱�, �������� ������ �� paint�� ȣ��
	}

	// ������Ʈ�� �ٽ� �׷��� �ʿ䰡 ���� �� �ڵ����� ȣ��ȴ�
	// paint(Graphics g)�� ���ϴ� �����̳� �׸� �ڵ� ����
	public void paint(Graphics g) {
		g.drawLine(20, 40, 50, 70); // ���� �׸���.
		g.drawRect(60, 40, 60, 40); // �簢���� �׸���.
		g.drawString("Java!", 140, 50); // ���ڿ��� �׸���.
	}
}

public class Pr1201 {
	public static void main(String[ ] args) {
		new MyGUI( ); // ������ ����
	}
}