import javax.swing.*;

public class MyFrame {
	public static void main(String[ ] args) {
		JFrame frame = new JFrame("Basic Swing"); // Frame 생성
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 80); // 프레임 크기(폭 400 픽셀, 높이 300 픽셀)
		frame.setVisible(true); // 프레임 화면에 표시, false이면 프레임 숨김
	}
}