import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
   MyGUI( ) {
	JButton btn = new JButton("마우스 이벤트 발생");
	btn.addMouseListener(new MouseListener( ) {
	   public void mouseReleased(MouseEvent e) {
		btn.setText(" Mouse Released : " + e.getX( ) + " , " + e.getY( ));
	  }

	   public void mousePressed(MouseEvent e) {
		btn.setText(" Mouse Pressed : " + e.getX( ) + " , " + e.getY( ));
	   }

	   public void mouseExited(MouseEvent e) {
		btn.setText("Mouse Exited : " + e.getX( ) + " , " + e.getY( ));
	   }

	   public void mouseEntered(MouseEvent e) {
		btn.setText("Mouse Entered : " + e.getX( ) + " , " + e.getY( ));
	   }

	   public void mouseClicked(MouseEvent e) {
		btn.setText(" Mouse Clicked : " + e.getX( ) + " , " + e.getY( ));
	   }
	});

	getContentPane( ).add(btn);

	setSize(300, 100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
   }
}

public class E1003 {
	public static void main(String[] args) {
		new MyGUI( );
	}
}