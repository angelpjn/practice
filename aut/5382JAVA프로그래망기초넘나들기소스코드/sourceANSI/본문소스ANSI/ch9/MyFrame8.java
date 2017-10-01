import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame { 
	public MyFrame( ) {
		setTitle("GridLayout Demo");
		setBounds(10, 10, 300, 200);

		GridBagLayout gbl = new GridBagLayout( );
		GridBagConstraints c = new GridBagConstraints( );
		JPanel panel = new JPanel( );
		panel.setLayout(gbl);

		JButton button = new JButton("Java");
		c.gridx = 0; // 컴포넌트 시작 위치(x, y), 최좌측상단 좌표값 (0,0)
		c.gridy = 0;
		c.gridwidth = 1; // 컨테이너 너비(셀 몇칸 차지), 기본값(생략해도 동일)
		c.gridheight = 1; // 컨테이너 높이, 기본값(생략해도 동일)
		c.weightx = 0.0; // 크기가 변경될 남는 공간을 상대적 중량으로 변경
		c.weighty = 0.0;
		c.anchor = GridBagConstraints.CENTER; // 배치 위치 가운데 배치
		c.fill = GridBagConstraints.BOTH; // 컴포넌트 크기 늘릴 때 전체 채우기
		c.insets = new Insets(0, 0, 0, 0); // 컴포넌트 외부 여백(상,좌,하,우)
		c.ipadx = 0; // 컴포넌트 내부 여백 설정
		c.ipady = 0;
		gbl.setConstraints(button, c);
		panel.add(button);

		// 생성자를 사용하여 GUI 디자인
		button = new JButton("C++");
		c = new GridBagConstraints(1, 0, 2, 1, 0.33, 0.2,
				GridBagConstraints.NORTH, GridBagConstraints.BOTH, 
           new Insets(0, 0, 0, 0), 0, 0);
		gbl.setConstraints(button, c);
		panel.add(button);

		button = new JButton("DB");
		c = new GridBagConstraints(3, 0, 3, 1, 0.4, 0.4,
				GridBagConstraints.NORTHEAST, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0);
		gbl.setConstraints(button, c);
		panel.add(button);

		for (int i = 0; i < 6; i++) {
			button = new JButton("(" + i + ",1)");
			c = new GridBagConstraints(i, 1, 1, 1, 1.0, 1.0,
					GridBagConstraints.CENTER, GridBagConstraints.RELATIVE,
				 new Insets(0, 0, 0, 0), 0, 0);
		   gbl.setConstraints(button, c);
		   panel.add(button);
		}

		add(panel); // getContentPane( ).add(panel); 과 동일함
		pack( ); // 프레임 크기 자동 조정
		setVisible(true);
	}
}

public class MyFrame8 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}