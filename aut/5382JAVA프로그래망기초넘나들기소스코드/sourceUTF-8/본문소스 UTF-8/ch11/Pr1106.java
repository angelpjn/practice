import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	static int count = 0;
	String disp = "";

	public MyGUI( ) {
		setTitle("JRadioButton Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new FlowLayout( ));

		JTextField tf1 = new JTextField(20);
		JTextField tf2 = new JTextField(20);
		JTextField tf3 = new JTextField(20);

		tf1.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				String str = ((JTextField) e.getSource( )).getText( );
				System.out.println("#1 입력한 내용: " + str);

				disp = "#2 입력한 내용: " + e.getActionCommand( );
				System.out.println(disp);

				String tval = tf1.getText( );
				System.out.println("#3 입력한 내용: " + tval);
				StringBuffer sb = new StringBuffer(e.getActionCommand( ));
				System.out.println("역순으로 출력: " + sb.reverse( ).toString( ));

				tf1.setText(""); // 입력한 텍스트필드 지우기
				String tval2 = tf1.getText( );
				System.out.println("updated text=>'" + tval2 + "'");
				JOptionPane.showMessageDialog(null, disp);
			}
		});

		panel.add(new JLabel("이름:"));
		panel.add(tf1);
		panel.add(new JLabel("나이:"));
		panel.add(tf2);
		panel.add(new JLabel("주소:"));
		panel.add(tf3);
		add(panel);

		setSize(300, 150);
		setVisible(true);
		tf1.requestFocus( );  // tf1으로 입력 포커스 이동, 삭제해도 동일
	}
}

public class Pr1106 {
	public static void main(final String args[ ]) {
		new MyGUI( );
	}
}