import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	JComboBox combo1, combo2;
	ImageIcon[ ] images = { new ImageIcon("c:/work/image/sunset.jpg"), 
                         new ImageIcon("c:/work/image/flower0.gif") };
	String seasons[ ] = { "봄", "여름", "가을", "겨울" };

	public MyGUI( ) {
		setTitle("JComboBox Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout( ));

		combo1 = new JComboBox(images);
		getContentPane( ).add(combo1, BorderLayout.NORTH);

		combo2 = new JComboBox<>(seasons);
		add(combo2, BorderLayout.SOUTH);

		combo2.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				Color currentBackground = combo2.getBackground( );
				Color color = JColorChooser.showDialog(combo2, 
                              "Color Chooser", currentBackground);
				if ((color != null) && (currentBackground != color)) {
					combo2.setBackground(color);
				}
			}
		});

		combo2.addItemListener(new ItemListener( ) {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange( ); // 상태변화 감지
				System.out.println(
                  (state == ItemEvent.SELECTED) ? "선택" : "미선택");
				System.out.println("항목: " + e.getItem( ));
				ItemSelectable is = e.getItemSelectable( );
				System.out.println(", 선택: " + selectedString(is));
			}
		});

		pack( );
		setLocationRelativeTo(null); // 프레임 중앙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료
		setVisible(true); // 화면에 보이기
	}

	static private String selectedString(ItemSelectable is) {
		Object selected[ ] = is.getSelectedObjects( );
		return ((selected.length == 0) ? "null" : (String) selected[0]);
	}
}

public class Pr1109 {
	public static void main(String[ ] args) {
		new MyGUI( ); // 프레임 생성
	}
}