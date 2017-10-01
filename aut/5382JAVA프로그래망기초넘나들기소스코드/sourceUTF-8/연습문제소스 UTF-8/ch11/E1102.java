import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class MyFrame extends JFrame implements ActionListener {
	private JButton jbn1, jbn2;
	private JPanel panel;

	public MyFrame( ) {
		// 지정된 이미지 아이콘 객체를 생성
		ImageIcon icon = new ImageIcon("C:/work/image/sunset.jpg");
		ImageIcon icon2 = new ImageIcon("C:/work/image/flower.jpg");

		// JPanel 객체를 생성하고 제목과 선이있는 경계선을 설정한다
		panel = new JPanel( );	
		panel.setBorder(new TitledBorder(new LineBorder(Color.lightGray),
				"<html><ul><li> 마우스 움직임에 따른 버튼 변화</li></html>"));
		panel.setBackground(Color.PINK);

		jbn1 = new JButton(icon);
		jbn2 = new JButton("Button", icon2);

		jbn1.setVerticalTextPosition(AbstractButton.CENTER);
		jbn1.setHorizontalTextPosition(AbstractButton.LEADING);
		jbn1.setMnemonic(KeyEvent.VK_D); // Alt-D 누르면 변경
		jbn1.setActionCommand("disable");
		jbn1.setToolTipText("disable the Center button.");
		jbn1.setToolTipText("Enable #2 button(Toggle)");

		// 텍스트는 이미지의 아래쪽에 위치, 텍스트는 이미지의 중앙에 위치
		jbn2.setVerticalTextPosition(AbstractButton.BOTTOM);
		jbn2.setHorizontalTextPosition(AbstractButton.CENTER);
		jbn2.setMnemonic(KeyEvent.VK_E); // Alt-E 누르면 변경
		jbn2.setActionCommand("enable");
		jbn2.setEnabled(false); // 생성시 버튼 Disable

		jbn2.setPressedIcon(icon); // 키 누를 때 모양
		jbn2.setRolloverIcon(icon2); // 키 위에 마우스 놓을 때

		jbn1.addActionListener(this); // 이벤트 핸들러 등록
		jbn2.addActionListener(this);
		jbn2.setToolTipText("Enable #1 button(Toggle)");

		panel.add(jbn1); // 패널에 그룹화된 라디오 버튼을 추가
		panel.add(jbn2); // 패널에 그룹화된 라디오 버튼을 추가
		add(panel); // 컴포넌트를 JFrame 에 추가한다

		// JFrame 의 속성을 설정한다
		setTitle("JButton Demo"); // 프레임의 제목
		setLayout(new FlowLayout( ));
		setBounds(300, 300, 350, 200);
		setLocationRelativeTo(null); // 프레임 중앙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // 화면에 띄우기
	}

	// 이벤트 핸들링위한 이벤트 처리	
	public void actionPerformed(ActionEvent e) {
		if ("disable".equals(e.getActionCommand( ))) {
			jbn1.setEnabled(false);
			jbn2.setEnabled(true);
		} else {
			jbn1.setEnabled(true);
			jbn2.setEnabled(false);
		}
	}
}

public class E1102 {
	public static void main(String[ ] args) {
		new MyFrame( ); // 프레임 생성
	}
}