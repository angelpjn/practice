import java.awt.*;
import java.util.*;
import javax.swing.*;

class MyGUI extends JFrame {
	String[ ] fruits = { "���", "��", "�ٳ���", "��", "��纣��", "����", "����", 
                  "����", "��", ������", "������", "�丶��", "���ξ���", "����",                    "���", "��", "����" };
	String filename1 = "c:/work/image/sunset.jpg";
	String filename2 = "c:/work/image/flower0.gif";
	ImageIcon[ ] images = { new ImageIcon(filename1), 
                         new ImageIcon(filename2) };
	private JList<String> countryList;

	public MyGUI( ) {
		setTitle("JList Demo");
		setLayout(new FlowLayout( ));

		JList<String> fruitList = new JList<>(fruits);
		// JList�� �׸� ����(����,����, ����) �����ϵ��� DefaultListModel ����
		final DefaultListModel<String> model = new DefaultListModel<>( );
		for (int i = 0, n = fruits.length; i < n; i++) {
			model.addElement(fruits[i]); // �׸� �߰�
		}
		JList<String> jlist = new JList<>(model); // ������ ����Ʈ
		jlist.setSelectedIndex(1); // 2��° �׸� ����(0���� �����ϹǷ�)
		System.out.println(fruitList.getSelectedValue( ));
		add(new JScrollPane(jlist), BorderLayout.CENTER); // ��ũ�� �ޱ�

		model.add(0, "First"); // ù��° ��ġ�� ����
		// model.clear( ); // ����Ʈ ��� �׸� ����
		model.addElement("Last"); // ����

		int size = model.getSize( ); // ����Ʈ �׸� ���� �˾Ƴ���
		model.insertElementAt("Middle", size / 2); // �߰��� ����
		model.set(0, "New First"); // ù��° ���� ����
		model.setElementAt("New Last", size - 1); // �� ���� ����
		// model.remove(0); // ù��° �׸� ����

		JList list = new JList( );
		list.setListData(images); // ����Ʈ�� �̹��� ����
		add(list);

		Vector colors = new Vector( );
		JList colorList = new JList(colors);

		colors.addElement("red");
		colors.addElement("green");
		add(colorList);

		pack( );
		setLocationRelativeTo(null); // ������ �߾�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â ����
		setVisible(true); // ȭ�鿡 ���̱�
	}
}

public class Pr1108 {
	public static void main(String[ ] args) {
		new MyGUI( ); // ������ ����
	}
}