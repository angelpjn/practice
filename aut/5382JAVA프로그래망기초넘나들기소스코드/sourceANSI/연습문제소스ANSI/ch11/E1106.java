import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	JTextArea ta = new JTextArea(5, 20); // 5줄 * 20개 입력 창

	public MyFrame( ) {
		setTitle("TextAreaDemo");
		ta.setText("한 칸에 30개, 7줄 문장 입력: ");
		JScrollPane sp = new JScrollPane(ta);  // 스크롤바를 사용하기 위해

		JPanel jp = new JPanel( );
		jp.setLayout(new FlowLayout( ));
		jp.add(sp); // 스크롤바 붙이기

		setContentPane(jp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack( );
		setVisible(true);
	}
}

public class E1106 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}