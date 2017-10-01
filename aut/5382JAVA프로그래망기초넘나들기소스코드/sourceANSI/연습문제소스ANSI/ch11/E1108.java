import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	private JComboBox combo;
	String[ ] menuItem = { "Java", "Oracle", "JSP", "Spring", "C", "C++", "DB",
			              "PotoShop", "PowerPoint" };
	Container c;

	public MyFrame( ) {
		setTitle("JComboBox Demo");
		c = getContentPane( );
		c.setLayout(new FlowLayout( ));
		combo = new JComboBox(menuItem);
		c.add(new JScrollPane(combo));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 220);
		setVisible(true);
	}
}

public class E1108 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}