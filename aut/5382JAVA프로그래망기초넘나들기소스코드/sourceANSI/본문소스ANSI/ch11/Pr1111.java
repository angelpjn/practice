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
				new String[ ] { "����", "����", "���Ĺ�" },
				new Object[ ] { "Array", "Vector" }, new JSlider( ),
				new ImageIcon("c:/work/image/right.gif"), "Bottom Message" };

		JPanel panel = new JPanel( );
		JButton nameBtn = new JButton("�̸�");
		JButton seasonBtn = new JButton("����");
		JButton confirmBtn = new JButton("Ȯ��");
		JButton messageBtn = new JButton("�޽���");
		JButton optionBtn = new JButton("�ɼ�");
		JTextField tf = new JTextField(12);

		panel.add(nameBtn); // �гο� ���̱�
		panel.add(seasonBtn);
		panel.add(confirmBtn);
		panel.add(messageBtn);
		panel.add(optionBtn);
		panel.add(tf);
		add(panel); // �����ӿ� �г� ���̱�

		nameBtn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("�̸� �Է�:");
				if (name != null)
					tf.setText(name);
			}
		});

		seasonBtn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				String[ ] str = { "��", "����", "����", "�ܿ�" };
				String season = (String) JOptionPane.showInputDialog(null,
						"�����", "Title", JOptionPane.QUESTION_MESSAGE, 
                    null, str, "����");
				if (season != null)
					tf.setText(season);
			}
		});

		confirmBtn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "����ұ��?",
						"Title", JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE, null);
				if (result == JOptionPane.CLOSED_OPTION)
					tf.setText("���þ��� �ݾ���...");
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
				String[ ] st = { "���ʽ�", "����ǰ", "�ް�" };
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