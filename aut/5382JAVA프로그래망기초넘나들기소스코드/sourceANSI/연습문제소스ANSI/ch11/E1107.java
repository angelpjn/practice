import java.awt.*;
import javax.swing.*; 
 
import javax.swing.ListSelectionModel;

class MyFrame extends JFrame {
	private JList list;
	String[ ] menuItem = { "Java", "Oracle", "JSP", "Spring", "C", "C++", "DB",
			              "PotoShop", "PowerPoint" };
	Container c;

	public MyFrame( ) {
		setTitle("JList Demo");
		c = getContentPane( );
		c.setLayout(new FlowLayout( ));
		list = new JList(menuItem);
		list.setSelectedIndex(0); // 첫 번째 항목 선택
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFixedCellWidth(80); // JList의 폭 지정
		c.add(new JScrollPane(list));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack( );
		setVisible(true);
	}
}

public class E1107 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}