import java.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E1010 extends JFrame {
	public MyGUI( ) {
		JTextField tf = new JTextField( );
		tf.setEditable(false); // 편집 X, 내용 보여주기만 가능
		tf.setHorizontalAlignment(JTextField.RIGHT);

		JPanel btnPanel = new JPanel( );
		btnPanel.setLayout(new FlowLayout( ));

		JButton btn = new JButton("1");
		btn.addActionListener(new MyListener( )); // 이벤트 등록& 호출
		btnPanel.add(btn);
		add(tf, BorderLayout.NORTH);
		add(btnPanel, BorderLayout.SOUTH);

		setResizable(false); // 창 크기 변경 X
		pack( ); // 자동 크기 지정
		setVisible(true); // 보이기
	}

	public static void main(String[] args) {
		new E1010( );
	}
}

// 독립된 클래스: ActionListener 작성
class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource( ); // 이벤트 발생 위치 얻기
		if (btn.getText( ).equals("1"))
			btn.setText("One");
		else
			btn.setText("1");
	}
}