import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	JTextField t, tf;
	JTextArea ta;

	public MyGUI( ) {
		setTitle("JTextArea Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout( ));

		tf = new JTextField(20);
		ta = new JTextArea(5, 10); // 5줄 x 10칸
		ta.setPreferredSize(new Dimension(100, 100));

		tf.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				t = (JTextField) e.getSource( ); // 입력 내용
				ta.append(t.getText( ) + "\n"); // 덧붙이기
				t.setText(""); // 텍스트필드 내용 지우기
			}
		});
		
		add(new JLabel("뉴스:"));
		add(tf);
		add(new JScrollPane(ta, 
                      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			              JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
		ta.setLineWrap(true);
	
		setSize(300, 200);
		setVisible(true);
	}
}

public class MPr1107 {
	public static void main(final String args[ ]) {
		new MyGUI( );
	}
}