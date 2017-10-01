import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame implements ActionListener {
	JButton foodBtn = new JButton("음식");
	JButton fruitBtn = new JButton("과일");
	JTextField text = new JTextField(20);

	MyGUI( ) {
		setTitle("Event Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout( ));

		text.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Text=" + text.getText( ));
			}
		});

		foodBtn.addActionListener(this);
		fruitBtn.addActionListener(this);

		add(foodBtn);
		add(fruitBtn);
		add(text, "Center");

		setSize(400, 100);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand( );
		if (e.getSource( ) == foodBtn)
			 foodBtn.setText("clicked!");

		if (str.equals("음식") | str.equals("clicked!")) {
			if (fruitBtn.isEnabled( )) {
				System.out.println("음식 선택. 과일은 비활성화(disabled)");
				text.setText("음식을 맛있게 먹는다.");
				fruitBtn.setEnabled(false);
			} else {
				System.out.println("음식 선택. 과일은 활성화(enabled)");
				text.setText("과일을 먹는다.");
				fruitBtn.setEnabled(true);
			}
		} else if (str.equals("과일"))
			System.out.println("과일 선택");
	}
}

public class E1005 {
	public static void main(String args[]) {
		new MyGUI( );
	}
}