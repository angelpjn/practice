import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	JTextField txtId = new JTextField(10);
	JButton btn1 = new JButton("�ߺ���ȸ");
	public MyFrame( ){
		setTitle("ȸ������");
		setLayout(new FlowLayout( ));
		add(new JLabel("���̵��Է�"));
		add(txtId);
		add(btn1);
		
		btn1.addActionListener(this);
		
		setSize(400, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String str = "�Է��Ͻ� ���̵��: "+txtId.getText( )+" �Դϴ�. ��� �Ͻðڽ��ϱ�?";
		//showMessageDialog(�θ�������Ʈ,��¸޽���, Ÿ��Ʋ���ڿ�, ����������);
		//JOptionPane.showMessageDialog(this,str, "����üũ", 
                                      JOptionPane.ERROR_MESSAGE);
		int n = JOptionPane.showConfirmDialog(this, str);
		if(n == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(this, "[��] ��ư");
		}else if(n == JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(this, "[�ƴϿ�] ��ư");
		}else if(n == JOptionPane.CANCEL_OPTION){
			JOptionPane.showMessageDialog(this, "[���] ��ư");
		}else if(n == JOptionPane.CLOSED_OPTION){
			JOptionPane.showMessageDialog(this, "[X] ��ư");
		}
	}	
}
public class E1110 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
} 