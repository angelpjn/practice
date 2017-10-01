import javax.swing.*;

class MyFrame extends JFrame {
	MyFrame( ) {
		setTitle("JMenu Demo");
		JMenuBar menuBar = new JMenuBar( );
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("Food");
		menuBar.add(menu); // Creates a menubar for a JFrame

		JMenuItem menuItem = new JMenuItem("Soup");
		menu.add(menuItem);

		JMenu subMenu = new JMenu("Action");
		menu.add(subMenu);
		subMenu.add(new JCheckBoxMenuItem("Eat", true));
		subMenu.add(new JCheckBoxMenuItem("Drink"));
		subMenu.add(new JCheckBoxMenuItem("Chew"));

		menu.addSeparator( );

		subMenu = new JMenu("type");
		menu.add(subMenu);
		subMenu.add(new JMenuItem("Bread"));
		subMenu.add(new JMenuItem("Rice"));

		menu = new JMenu("dessert");
		menuBar.add(menu);

		ButtonGroup bg = new ButtonGroup( );
		JRadioButtonMenuItem radioMenuItem;
		radioMenuItem = new JRadioButtonMenuItem("Coffee");
		radioMenuItem = new JRadioButtonMenuItem("Tea");
		radioMenuItem.setSelected(true);
		radioMenuItem = new JRadioButtonMenuItem("Water");

		bg.add(radioMenuItem);
		bg.add(radioMenuItem);
		bg.add(radioMenuItem);

		menu.add(radioMenuItem);
		menu.add(radioMenuItem);
		menu.add(radioMenuItem);

		setSize(250, 150);
		setVisible(true);
	}
}

public class E1109 {
	public static void main(String args[ ]) {
		new MyFrame( );
	}
}