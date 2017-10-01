import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	private JLabel jl1, jl2, jl3, jl4;
	public MyFrame( ) {
		setTitle("JLabel Demo");		
		JPanel panel = new JPanel( ); // �г� ����
		getContentPane( ).add(panel); // ������Ʈ ���� �����̳� ����

		ImageIcon image = new ImageIcon("c:/work/image/flower.jpg");
		setLayout(new FlowLayout( )); // ��� �⺻ ��ġ ������

		jl1 = new JLabel("Text");
		jl2 = new JLabel("<html><ul><li>Can</li>" + "<li>Act</li></html>");

		jl3 = new JLabel(image);
		jl4 = new JLabel("Image", image, JLabel.CENTER);
		// �������� �������� �ؽ�Ʈ ��ġ(�ϴ� �߾�)
		jl4.setVerticalTextPosition(JLabel.BOTTOM);
		jl4.setHorizontalTextPosition(JLabel.CENTER);

		add(jl1); // �гο� ���̺� �߰�
		add(jl2);
		add(jl3);
		add(jl4);

		pack( );
		// ������ x��ư�� ������ â�� ����� �� �ְ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); // ȭ�鿡 ���̱�
	}
}
public class E1101 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}