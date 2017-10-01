import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class MyFrame extends JFrame implements ActionListener {
	private JButton jbn1, jbn2;
	private JPanel panel;

	public MyFrame( ) {
		// ������ �̹��� ������ ��ü�� ����
		ImageIcon icon = new ImageIcon("C:/work/image/sunset.jpg");
		ImageIcon icon2 = new ImageIcon("C:/work/image/flower.jpg");

		// JPanel ��ü�� �����ϰ� ����� �����ִ� ��輱�� �����Ѵ�
		panel = new JPanel( );	
		panel.setBorder(new TitledBorder(new LineBorder(Color.lightGray),
				"<html><ul><li> ���콺 �����ӿ� ���� ��ư ��ȭ</li></html>"));
		panel.setBackground(Color.PINK);

		jbn1 = new JButton(icon);
		jbn2 = new JButton("Button", icon2);

		jbn1.setVerticalTextPosition(AbstractButton.CENTER);
		jbn1.setHorizontalTextPosition(AbstractButton.LEADING);
		jbn1.setMnemonic(KeyEvent.VK_D); // Alt-D ������ ����
		jbn1.setActionCommand("disable");
		jbn1.setToolTipText("disable the Center button.");
		jbn1.setToolTipText("Enable #2 button(Toggle)");

		// �ؽ�Ʈ�� �̹����� �Ʒ��ʿ� ��ġ, �ؽ�Ʈ�� �̹����� �߾ӿ� ��ġ
		jbn2.setVerticalTextPosition(AbstractButton.BOTTOM);
		jbn2.setHorizontalTextPosition(AbstractButton.CENTER);
		jbn2.setMnemonic(KeyEvent.VK_E); // Alt-E ������ ����
		jbn2.setActionCommand("enable");
		jbn2.setEnabled(false); // ������ ��ư Disable

		jbn2.setPressedIcon(icon); // Ű ���� �� ���
		jbn2.setRolloverIcon(icon2); // Ű ���� ���콺 ���� ��

		jbn1.addActionListener(this); // �̺�Ʈ �ڵ鷯 ���
		jbn2.addActionListener(this);
		jbn2.setToolTipText("Enable #1 button(Toggle)");

		panel.add(jbn1); // �гο� �׷�ȭ�� ���� ��ư�� �߰�
		panel.add(jbn2); // �гο� �׷�ȭ�� ���� ��ư�� �߰�
		add(panel); // ������Ʈ�� JFrame �� �߰��Ѵ�

		// JFrame �� �Ӽ��� �����Ѵ�
		setTitle("JButton Demo"); // �������� ����
		setLayout(new FlowLayout( ));
		setBounds(300, 300, 350, 200);
		setLocationRelativeTo(null); // ������ �߾�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // ȭ�鿡 ����
	}

	// �̺�Ʈ �ڵ鸵���� �̺�Ʈ ó��	
	public void actionPerformed(ActionEvent e) {
		if ("disable".equals(e.getActionCommand( ))) {
			jbn1.setEnabled(false);
			jbn2.setEnabled(true);
		} else {
			jbn1.setEnabled(true);
			jbn2.setEnabled(false);
		}
	}
}

public class E1102 {
	public static void main(String[ ] args) {
		new MyFrame( ); // ������ ����
	}
}