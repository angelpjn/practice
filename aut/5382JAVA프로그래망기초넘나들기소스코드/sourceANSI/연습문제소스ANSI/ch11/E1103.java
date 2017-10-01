import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ItemListener {

	private JPanel panel;
	private JLabel label;
	private JCheckBox checkBox1, checkBox2, checkBox3;
	private int sum = 0;

	public MyFrame( ) {
		this.getContentPane( ).setLayout(new FlowLayout( ));
		panel = new JPanel( ); // �г�
		panel.setBackground(Color.magenta);

		checkBox1 = new JCheckBox("One");
		checkBox1.setSelected(true);
		checkBox1.setMnemonic('O'); // O�� ����, Alt+O ������ ��ư ����
		checkBox1.setToolTipText("Click�� ������ ����/���� ��Ŭ");

		checkBox2 = new JCheckBox("Two", false);
		checkBox2.setMnemonic('w'); // O�� ����, Alt+w ������ ��ư ����
		checkBox3 = new JCheckBox("Three");
		checkBox3.setMnemonic('T'); // O�� ����, Alt+T ������ ��ư ����

		// ������ �����Ͽ� �̺�Ʈ�� ���� ����
		checkBox1.addItemListener(this);
		checkBox2.addItemListener(this);
		checkBox3.addItemListener(this);
		checkBox3.addActionListener(actionListener);

		label = new JLabel("�հ�: 0");
		panel.add(checkBox1);
		panel.add(checkBox2);
		panel.add(checkBox3);
		panel.add(label);
		add(panel);

		pack( );
		setLocationRelativeTo(null); // ������ �߾�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	ActionListener actionListener = new ActionListener( ) {
		public void actionPerformed(ActionEvent actionEvent) {
			AbstractButton ab = (AbstractButton) actionEvent.getSource( );
			boolean selected = ab.getModel( ).isSelected( );
			System.out.println(selected);
			// ab.setText("Action");
		}
	};

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange( ) == ItemEvent.SELECTED) {
			if (e.getItem( ) == checkBox1) {
				sum += 1;
			} else if (e.getItem( ) == checkBox2) {
				sum += 2;
			} else if (e.getItem( ) == checkBox3) {
				sum += 3;
			}
			label.setText("�հ�: " + sum);
		}
	}
}

public class E1103 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}