import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	JMenuItem ItemNew, ItemOpen, ItemSave;
	JMenuBar menuBar;
	JMenu MenuFile, MenuEdit, MenuView, MenuDebug;

	MyGUI( ) {
		setTitle("�޴� �����");
		designUI( ); // �޴��� �����Ͽ� �����ӿ� ����
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// �� �޴��� ���� �޴��� ����� �����ӿ� ����
	void designUI( ) {
		menuBar = new JMenuBar( ); // �޴��� ����

		MenuFile = new JMenu("File"); // ����(1��) �޴��� File �޴� ����	
		MenuFile.setMnemonic(KeyEvent.VK_F); // ����Ű�� Alt + F ���� ����

		// File �޴��� �޴������� ���� ����
		ItemNew = new JMenuItem("New"); // ����(2��) �޴� ��(������) ����
		ItemNew.addActionListener(new MenuBarActionListener( )); // ����

		ItemNew.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				JMenuItem source = (JMenuItem) (e.getSource( ));
				String s = "�޴� ������ : " + source.getText( );
				System.out.println(s);
			}
		});

		ItemNew.setActionCommand("New");
		ItemNew.addActionListener(new MenuBarActionListener( ));
		MenuFile.add(ItemNew);

		ItemOpen = new JMenuItem("Open", KeyEvent.VK_O);
		MenuFile.add(ItemOpen);
		ItemOpen.setActionCommand("Open");
		ItemOpen.addActionListener(new MenuBarActionListener( ));
		MenuFile.addSeparator( ); // �и��� ����
		MenuFile.addSeparator( ); // �и��� ����

		MenuFile.add(new JMenuItem("Close"));
		MenuFile.add(new JMenuItem("Save"));

		// �޴��ٿ� �޴� ����
		menuBar.add(MenuFile); // �޴��ٿ� File �޴� ����
		menuBar.add(new JMenu("Edit")); // ���� �޴� Edit ����
		menuBar.add(new JMenu("View"));
		menuBar.add(new JMenu("Debug"));
		setJMenuBar(menuBar); // �޴��ٸ� �����ӿ� ���̱�
	}

	// �޴� �������� ���õ� �� ó��
	class MenuBarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if ("New".equals(e.getActionCommand( ))) {
				JOptionPane.showMessageDialog(null,
						"Selected Item: " + e.getActionCommand( ));
			}
			if ("Open".equals(e.getActionCommand( ))) {
				JOptionPane.showMessageDialog(null,
						"Selected Item: " + e.getActionCommand( ));
			}
		}
	}
}

public class Pr1110 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}