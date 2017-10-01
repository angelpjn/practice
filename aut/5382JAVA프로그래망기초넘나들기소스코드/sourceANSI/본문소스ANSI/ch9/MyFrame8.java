import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame { 
	public MyFrame( ) {
		setTitle("GridLayout Demo");
		setBounds(10, 10, 300, 200);

		GridBagLayout gbl = new GridBagLayout( );
		GridBagConstraints c = new GridBagConstraints( );
		JPanel panel = new JPanel( );
		panel.setLayout(gbl);

		JButton button = new JButton("Java");
		c.gridx = 0; // ������Ʈ ���� ��ġ(x, y), ��������� ��ǥ�� (0,0)
		c.gridy = 0;
		c.gridwidth = 1; // �����̳� �ʺ�(�� ��ĭ ����), �⺻��(�����ص� ����)
		c.gridheight = 1; // �����̳� ����, �⺻��(�����ص� ����)
		c.weightx = 0.0; // ũ�Ⱑ ����� ���� ������ ����� �߷����� ����
		c.weighty = 0.0;
		c.anchor = GridBagConstraints.CENTER; // ��ġ ��ġ ��� ��ġ
		c.fill = GridBagConstraints.BOTH; // ������Ʈ ũ�� �ø� �� ��ü ä���
		c.insets = new Insets(0, 0, 0, 0); // ������Ʈ �ܺ� ����(��,��,��,��)
		c.ipadx = 0; // ������Ʈ ���� ���� ����
		c.ipady = 0;
		gbl.setConstraints(button, c);
		panel.add(button);

		// �����ڸ� ����Ͽ� GUI ������
		button = new JButton("C++");
		c = new GridBagConstraints(1, 0, 2, 1, 0.33, 0.2,
				GridBagConstraints.NORTH, GridBagConstraints.BOTH, 
           new Insets(0, 0, 0, 0), 0, 0);
		gbl.setConstraints(button, c);
		panel.add(button);

		button = new JButton("DB");
		c = new GridBagConstraints(3, 0, 3, 1, 0.4, 0.4,
				GridBagConstraints.NORTHEAST, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0);
		gbl.setConstraints(button, c);
		panel.add(button);

		for (int i = 0; i < 6; i++) {
			button = new JButton("(" + i + ",1)");
			c = new GridBagConstraints(i, 1, 1, 1, 1.0, 1.0,
					GridBagConstraints.CENTER, GridBagConstraints.RELATIVE,
				 new Insets(0, 0, 0, 0), 0, 0);
		   gbl.setConstraints(button, c);
		   panel.add(button);
		}

		add(panel); // getContentPane( ).add(panel); �� ������
		pack( ); // ������ ũ�� �ڵ� ����
		setVisible(true);
	}
}

public class MyFrame8 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}