import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class MyGUI extends JFrame {
	JLabel lb, lb2;

	public MyGUI( ) {
		setTitle("JLabel Demo");
		setLayout(new FlowLayout( ));

		lb = new JLabel("Java");
		lb2 = new JLabel("<html><ul><li>Can</li>" + "<li>Act</li></html>");
		Border border = BorderFactory.createLineBorder(Color.RED);
		lb.setBorder(border);
		lb.setPreferredSize(new Dimension(150, 100));

		lb.setText("Message");
		lb.setHorizontalAlignment(JLabel.CENTER);
		lb.setVerticalAlignment(JLabel.CENTER);

		add(lb);
		add(lb2);
		setSize(250, 150); // ũ��
		setLocationRelativeTo(null); // ������ �߾�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â ����
		setVisible(true); // ȭ�鿡 ���̱�
	}
}

public class Pr1101 {
	public static void main(String[ ] args) {		
		new MyGUI( ); // ������ ����
	}
}