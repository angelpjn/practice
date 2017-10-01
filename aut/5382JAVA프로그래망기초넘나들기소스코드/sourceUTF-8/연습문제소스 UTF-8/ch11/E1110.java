import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	JTextField txtId = new JTextField(10);
	JButton btn1 = new JButton("중복조회");
	public MyFrame( ){
		setTitle("회원가입");
		setLayout(new FlowLayout( ));
		add(new JLabel("아이디입력"));
		add(txtId);
		add(btn1);
		
		btn1.addActionListener(this);
		
		setSize(400, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String str = "입력하신 아이디는: "+txtId.getText( )+" 입니다. 사용 하시겠습니까?";
		//showMessageDialog(부모컴포넌트,출력메시지, 타이틀문자열, 아이콘형태);
		//JOptionPane.showMessageDialog(this,str, "중폭체크", 
                                      JOptionPane.ERROR_MESSAGE);
		int n = JOptionPane.showConfirmDialog(this, str);
		if(n == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(this, "[예] 버튼");
		}else if(n == JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(this, "[아니오] 버튼");
		}else if(n == JOptionPane.CANCEL_OPTION){
			JOptionPane.showMessageDialog(this, "[취소] 버튼");
		}else if(n == JOptionPane.CLOSED_OPTION){
			JOptionPane.showMessageDialog(this, "[X] 버튼");
		}
	}	
}
public class E1110 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
} 