import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	JComboBox combo1, combo2;
	ImageIcon[ ] images = { new ImageIcon("c:/work/image/sunset.jpg"), 
                         new ImageIcon("c:/work/image/flower0.gif") };
	String seasons[ ] = { "��", "����", "����", "�ܿ�" };

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
				int state = e.getStateChange( ); // ���º�ȭ ����
				System.out.println(
                  (state == ItemEvent.SELECTED) ? "����" : "�̼���");
				System.out.println("�׸�: " + e.getItem( ));
				ItemSelectable is = e.getItemSelectable( );
				System.out.println(", ����: " + selectedString(is));
			}
		});

		pack( );
		setLocationRelativeTo(null); // ������ �߾�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â ����
		setVisible(true); // ȭ�鿡 ���̱�
	}

	static private String selectedString(ItemSelectable is) {
		Object selected[ ] = is.getSelectedObjects( );
		return ((selected.length == 0) ? "null" : (String) selected[0]);
	}
}

public class Pr1109 {
	public static void main(String[ ] args) {
		new MyGUI( ); // ������ ����
	}
}