import javax.swing.*;

public class MyFrame {
	public static void main(String[ ] args) {
		JFrame frame = new JFrame("Basic Swing"); // Frame ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 80); // ������ ũ��(�� 400 �ȼ�, ���� 300 �ȼ�)
		frame.setVisible(true); // ������ ȭ�鿡 ǥ��, false�̸� ������ ����
	}
}