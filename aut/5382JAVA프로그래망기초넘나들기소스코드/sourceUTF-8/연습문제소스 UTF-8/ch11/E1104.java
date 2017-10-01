import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class MyFrame extends JFrame {
	JPanel panel;
	JRadioButton rbtn1, rbtn2, rbtn3;
	ImageIcon icon = new ImageIcon("C:/work/image/leaf.jpg");
	JLabel label;
	MyHandler myListener = null;

	public MyFrame( ) {
		rbtn1 = new JRadioButton("Red", icon); // 이미지 라디오 버튼
		rbtn1.setForeground(Color.RED); // 텍스트는 발강색
		rbtn1.setMnemonic('e'); // Alt + e로 동작, e 밑에 밑줄표시
		rbtn1.setBounds(40, 50, 30, 30); // 위치(x좌표,y좌표),크기(가로,세로)

		rbtn2 = new JRadioButton("Green", false);
		rbtn2.setForeground(Color.GREEN); // 텍스트는 발강색
		rbtn2.setMnemonic('G'); // Alt + G로 동작, G 밑에 밑줄표시
		rbtn2.setActionCommand("sunset"); // 버튼이 동작을 하게하는 문자열

		rbtn3 = new JRadioButton("Blue", true); // 초기에 선택
		rbtn3.setForeground(Color.BLUE); // 텍스트는 빨강색
		rbtn3.setMnemonic('u'); // Alt + u로 동작, u 밑에 밑줄표시
		rbtn3.setSelected(true); // 지정한 라디오 버튼 선택
		rbtn3.setActionCommand("tulip");
		rbtn3.setBounds(60, 60, 40, 30);

		ButtonGroup group = new ButtonGroup( ); // 그룹 묶기 위한 객체
		group.add(rbtn1); // 라디오 버튼을 버튼 그룹에 추가하여 그룹화
		group.add(rbtn2);
		group.add(rbtn3);

		// 이벤트 처리
		rbtn1.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, "Red");
			}
		});

		myListener = new MyHandler( );
		rbtn2.addActionListener(myListener);
		rbtn3.addActionListener(myListener);

		label = new JLabel(new ImageIcon("c:/work/image/flower.jpg"));
		label.setPreferredSize(new Dimension(142, 62)); // 최적 크기 지정
		setLayout(new BorderLayout( ));

		// 그룹화된 라디오 버튼을 추가할 JPanel 생성, 움푹한 경계선을 설정
		panel = new JPanel( );
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		panel.setLayout(new GridLayout(3, 1)); // 3행 x 1열 행렬 모양

		panel.add(rbtn1); // 패널에 그룹화된 라디오 버튼을 추가
		panel.add(rbtn2);
		panel.add(rbtn3);

		setLayout(new BorderLayout( ));
		add(panel, BorderLayout.WEST); // JFrame에 붙여야 화면에 표시
		add(label, BorderLayout.CENTER);
		panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		setTitle("JRadioButton Demo");
		setSize(250, 150); // setSize(가로길이, 세로길이), (넓이, 높이)
		setLocationRelativeTo(null); // 프레임 중앙,setLocation(x, y)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	class MyHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.GREEN);
			label.setIcon(new ImageIcon("c:/work/image/" + e.getActionCommand( )
					+ ".jpg"));
		}
	}
}

public class E1104 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}