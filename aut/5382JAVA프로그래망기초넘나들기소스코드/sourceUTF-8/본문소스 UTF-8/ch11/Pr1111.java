import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	public MyGUI( ) {
		setTitle("JOptionPane Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		designUI( );
		setSize(500, 150);
		setVisible(true);
	}

	void designUI( ) {
		Object msg[ ] = { "Top Message",
				new ImageIcon("c:/work/image/sunset.jpg"), new JButton("Menu"),
				new String[ ] { "나라", "우주", "동식물" },
				new Object[ ] { "Array", "Vector" }, new JSlider( ),
				new ImageIcon("c:/work/image/right.gif"), "Bottom Message" };

		JPanel panel = new JPanel( );
		JButton nameBtn = new JButton("이름");
		JButton seasonBtn = new JButton("계절");
		JButton confirmBtn = new JButton("확인");
		JButton messageBtn = new JButton("메시지");
		JButton optionBtn = new JButton("옵션");
		JTextField tf = new JTextField(12);

		panel.add(nameBtn); // 패널에 붙이기
		panel.add(seasonBtn);
		panel.add(confirmBtn);
		panel.add(messageBtn);
		panel.add(optionBtn);
		panel.add(tf);
		add(panel); // 프레임에 패널 붙이기

		nameBtn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("이름 입력:");
				if (name != null)
					tf.setText(name);
			}
		});

		seasonBtn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				String[ ] str = { "봄", "여름", "가을", "겨울" };
				String season = (String) JOptionPane.showInputDialog(null,
						"사계절", "Title", JOptionPane.QUESTION_MESSAGE, 
                    null, str, "가을");
				if (season != null)
					tf.setText(season);
			}
		});

		confirmBtn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "계속할까요?",
						"Title", JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE, null);
				if (result == JOptionPane.CLOSED_OPTION)
					tf.setText("선택없이 닫았음...");
				else if (result == JOptionPane.YES_OPTION)
					tf.setText("yes");
				else
					tf.setText("no");
			}
		});

		messageBtn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				JOptionPane optionPane = new JOptionPane( );
				optionPane.setMessage(msg);
		      optionPane.setMessageType(
                      JOptionPane.INFORMATION_MESSAGE);
				JDialog dialog = optionPane.createDialog(null, "Title");
				dialog.setVisible(true);
				JOptionPane.showMessageDialog(null, "Msg", "Title",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
		});

		JButton btn3 = new JButton("showOptionDialog Demo");
		optionBtn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				String[ ] st = { "보너스", "사은품", "휴가" };
				JOptionPane.showOptionDialog(null, "Msg", "Title",
				JOptionPane.DEFAULT_OPTION, 
           JOptionPane.ERROR_MESSAGE, null, st, st[0]);	
			}
		});
	}
}

public class Pr1111 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}