import java.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E1010 extends JFrame {
	public MyGUI( ) {
		JTextField tf = new JTextField( );
		tf.setEditable(false); // ���� X, ���� �����ֱ⸸ ����
		tf.setHorizontalAlignment(JTextField.RIGHT);

		JPanel btnPanel = new JPanel( );
		btnPanel.setLayout(new FlowLayout( ));

		JButton btn = new JButton("1");
		btn.addActionListener(new MyListener( )); // �̺�Ʈ ���& ȣ��
		btnPanel.add(btn);
		add(tf, BorderLayout.NORTH);
		add(btnPanel, BorderLayout.SOUTH);

		setResizable(false); // â ũ�� ���� X
		pack( ); // �ڵ� ũ�� ����
		setVisible(true); // ���̱�
	}

	public static void main(String[] args) {
		new E1010( );
	}
}

// ������ Ŭ����: ActionListener �ۼ�
class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource( ); // �̺�Ʈ �߻� ��ġ ���
		if (btn.getText( ).equals("1"))
			btn.setText("One");
		else
			btn.setText("1");
	}
}