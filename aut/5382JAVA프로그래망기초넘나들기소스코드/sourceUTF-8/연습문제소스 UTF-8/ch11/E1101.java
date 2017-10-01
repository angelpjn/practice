import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	private JLabel jl1, jl2, jl3, jl4;
	public MyFrame( ) {
		setTitle("JLabel Demo");		
		JPanel panel = new JPanel( ); // 패널 생성
		getContentPane( ).add(panel); // 컴포넌트 담을 컨테이너 생성

		ImageIcon image = new ImageIcon("c:/work/image/flower.jpg");
		setLayout(new FlowLayout( )); // 페널 기본 배치 관리자

		jl1 = new JLabel("Text");
		jl2 = new JLabel("<html><ul><li>Can</li>" + "<li>Act</li></html>");

		jl3 = new JLabel(image);
		jl4 = new JLabel("Image", image, JLabel.CENTER);
		// 아이콘을 기준으로 텍스트 위치(하단 중앙)
		jl4.setVerticalTextPosition(JLabel.BOTTOM);
		jl4.setHorizontalTextPosition(JLabel.CENTER);

		add(jl1); // 패널에 레이블 추가
		add(jl2);
		add(jl3);
		add(jl4);

		pack( );
		// 프레임 x버튼을 누르면 창이 종료될 수 있게 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); // 화면에 보이기
	}
}
public class E1101 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}