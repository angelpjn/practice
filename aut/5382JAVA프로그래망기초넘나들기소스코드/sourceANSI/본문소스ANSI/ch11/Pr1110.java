import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	JMenuItem ItemNew, ItemOpen, ItemSave;
	JMenuBar menuBar;
	JMenu MenuFile, MenuEdit, MenuView, MenuDebug;

	MyGUI( ) {
		setTitle("메뉴 만들기");
		designUI( ); // 메뉴를 생성하여 프레임에 삽입
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// 주 메뉴와 서브 메뉴를 만들어 프레임에 삽입
	void designUI( ) {
		menuBar = new JMenuBar( ); // 메뉴바 생성

		MenuFile = new JMenu("File"); // 메인(1차) 메뉴탭 File 메뉴 생성	
		MenuFile.setMnemonic(KeyEvent.VK_F); // 단축키를 Alt + F 으로 설정

		// File 메뉴에 메뉴아이템 생성 삽입
		ItemNew = new JMenuItem("New"); // 서브(2차) 메뉴 탭(아이템) 설정
		ItemNew.addActionListener(new MenuBarActionListener( )); // 장착

		ItemNew.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				JMenuItem source = (JMenuItem) (e.getSource( ));
				String s = "메뉴 아이템 : " + source.getText( );
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
		MenuFile.addSeparator( ); // 분리선 삽입
		MenuFile.addSeparator( ); // 분리선 삽입

		MenuFile.add(new JMenuItem("Close"));
		MenuFile.add(new JMenuItem("Save"));

		// 메뉴바에 메뉴 삽입
		menuBar.add(MenuFile); // 메뉴바에 File 메뉴 삽입
		menuBar.add(new JMenu("Edit")); // 서브 메뉴 Edit 삽입
		menuBar.add(new JMenu("View"));
		menuBar.add(new JMenu("Debug"));
		setJMenuBar(menuBar); // 메뉴바를 프레임에 붙이기
	}

	// 메뉴 아이템이 선택될 때 처리
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