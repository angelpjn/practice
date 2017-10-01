import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame { // 창 틀 만들기
	JLabel label = new JLabel("이름"); // 3개의 컴포넌트
	JButton button = new JButton("확인");
	JTextField textfield = new JTextField(20);

	public MyFrame( ) {
		setLayout(new FlowLayout( ));
		add(label); // 레이블 추가하여 배치하기
		add(textfield); // 텍스트필드
		add(button); // 버튼
		setSize(300, 100); // 창 크기
		setVisible(true); // 창 출력
	}
}

public class MyFrame4 {
	public static void main(String[ ] args) {
		JFrame frime = new MyFrame( );
	}
}