import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame implements ActionListener {
	JButton foodBtn = new JButton("����");
	JButton fruitBtn = new JButton("����");
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

		if (str.equals("����") | str.equals("clicked!")) {
			if (fruitBtn.isEnabled( )) {
				System.out.println("���� ����. ������ ��Ȱ��ȭ(disabled)");
				text.setText("������ ���ְ� �Դ´�.");
				fruitBtn.setEnabled(false);
			} else {
				System.out.println("���� ����. ������ Ȱ��ȭ(enabled)");
				text.setText("������ �Դ´�.");
				fruitBtn.setEnabled(true);
			}
		} else if (str.equals("����"))
			System.out.println("���� ����");
	}
}

public class E1005 {
	public static void main(String args[]) {
		new MyGUI( );
	}
}