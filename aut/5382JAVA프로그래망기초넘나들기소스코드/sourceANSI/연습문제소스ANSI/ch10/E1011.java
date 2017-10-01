import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E1011 extends JFrame {
	private JTextField tf;

	public E1011( ) {
		tf = new JTextField( );
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

	// ���� Ŭ����: ActionListener �ۼ�
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource( ); // �̺�Ʈ �߻� ��ġ ���
			tf.setCaretPosition(tf.getDocument( ).getLength( ));
			tf.replaceSelection(source.getActionCommand( )); // ��ư �� ������
		}
	}

	public static void main(String[] args) {
		new E1011( );
	}
}