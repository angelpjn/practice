import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class MyFrame extends JFrame {
	JPanel panel;
	JRadioButton rbtn1, rbtn2, rbtn3;
	ImageIcon icon = new ImageIcon("C:/work/image/leaf.jpg");
	JLabel label;
	MyHandler myListener = null;

	public MyFrame( ) {
		rbtn1 = new JRadioButton("Red", icon); // �̹��� ���� ��ư
		rbtn1.setForeground(Color.RED); // �ؽ�Ʈ�� �߰���
		rbtn1.setMnemonic('e'); // Alt + e�� ����, e �ؿ� ����ǥ��
		rbtn1.setBounds(40, 50, 30, 30); // ��ġ(x��ǥ,y��ǥ),ũ��(����,����)

		rbtn2 = new JRadioButton("Green", false);
		rbtn2.setForeground(Color.GREEN); // �ؽ�Ʈ�� �߰���
		rbtn2.setMnemonic('G'); // Alt + G�� ����, G �ؿ� ����ǥ��
		rbtn2.setActionCommand("sunset"); // ��ư�� ������ �ϰ��ϴ� ���ڿ�

		rbtn3 = new JRadioButton("Blue", true); // �ʱ⿡ ����
		rbtn3.setForeground(Color.BLUE); // �ؽ�Ʈ�� ������
		rbtn3.setMnemonic('u'); // Alt + u�� ����, u �ؿ� ����ǥ��
		rbtn3.setSelected(true); // ������ ���� ��ư ����
		rbtn3.setActionCommand("tulip");
		rbtn3.setBounds(60, 60, 40, 30);

		ButtonGroup group = new ButtonGroup( ); // �׷� ���� ���� ��ü
		group.add(rbtn1); // ���� ��ư�� ��ư �׷쿡 �߰��Ͽ� �׷�ȭ
		group.add(rbtn2);
		group.add(rbtn3);

		// �̺�Ʈ ó��
		rbtn1.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, "Red");
			}
		});

		myListener = new MyHandler( );
		rbtn2.addActionListener(myListener);
		rbtn3.addActionListener(myListener);

		label = new JLabel(new ImageIcon("c:/work/image/flower.jpg"));
		label.setPreferredSize(new Dimension(142, 62)); // ���� ũ�� ����
		setLayout(new BorderLayout( ));

		// �׷�ȭ�� ���� ��ư�� �߰��� JPanel ����, ��ǫ�� ��輱�� ����
		panel = new JPanel( );
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		panel.setLayout(new GridLayout(3, 1)); // 3�� x 1�� ��� ���

		panel.add(rbtn1); // �гο� �׷�ȭ�� ���� ��ư�� �߰�
		panel.add(rbtn2);
		panel.add(rbtn3);

		setLayout(new BorderLayout( ));
		add(panel, BorderLayout.WEST); // JFrame�� �ٿ��� ȭ�鿡 ǥ��
		add(label, BorderLayout.CENTER);
		panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		setTitle("JRadioButton Demo");
		setSize(250, 150); // setSize(���α���, ���α���), (����, ����)
		setLocationRelativeTo(null); // ������ �߾�,setLocation(x, y)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	class MyHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.GREEN);
			label.setIcon(new ImageIcon("c:/work/image/" + e.getActionCommand( )
					+ ".jpg"));
		}
	}
}

public class E1104 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}