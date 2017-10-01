import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(20, 30);
	String s;
	public MyGUI( ) {
		setTitle("Key Event Demo");
		JPanel panell = new JPanel(new FlowLayout( ));
		JPanel panel2 = new JPanel(new FlowLayout( ));

		tf.addKeyListener(new MyKeyListener( ));  // 리스너 등록 및 호출
		tf.addKeyListener(new MyKeyAdapter( )); // 어댑터 등록 및 호출

		panell.add(tf);
		panel2.add(ta);
		add(panell, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);

		setBounds(100, 150, 400, 200);
		setResizable(false); // 창 크기 변경 X
		setVisible(true); // 보이기
	}

	class MyKeyListener implements KeyListener {
		public void keyTyped(KeyEvent e) { // 키를 떼는 순간
			char c = e.getKeyChar( );
			s += "\n Key Type = " + String.valueOf(c);
			System.out.println(s);
			ta.setText(s);
		}

		public void keyPressed(KeyEvent e) { // 키 누른순간
			int c = e.getKeyCode( );
			s += "\n Key Pressed = " + String.valueOf(c);
			System.out.println(s);
			ta.setText(s);
		}

		// 누른키를 떼는 순간 유니코드 키(문자 키)가 입력된 경우에만
		public void keyReleased(KeyEvent e) {
			int c = e.getKeyCode( );
			s += "\n Released = " + String.valueOf(c);
			System.out.println(String.valueOf(c));
			ta.setText(s);
		}
	}

	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode( );
			String text = tf.getText( ); // 입력된 코드 가져와
			switch (keyCode) {
			case KeyEvent.VK_ENTER: // 엔터 키
				ta.setText(text); break;
			case KeyEvent.VK_LEFT: // 왼쪽 화살표 키
				tf.setLocation(tf.getX( ) - 10, tf.getY( )); 	break;
			case KeyEvent.VK_RIGHT: // 오른쪽 화살표 키
				tf.setLocation(tf.getX( ) + 10, tf.getY( )); 	break;
			}
		}
	}
}

public class MyFrame17 {
	public static void main(String[] args) {
		new MyGUI( );
	}
}