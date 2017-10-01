import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	int mouseX, mouseY;
	int draggedMouseX, draggedMouseY;
	boolean mouseDragged;

	public MyGUI( ) {
		setTitle("JPanel�� �̹����� paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pnl = new JPanel(null);
		add(pnl);

		JPanel area = new JPanel( );
		area.setBackground(Color.white);

		area.setBounds(20, 20, 200, 150);
		pnl.add(area);

		// setContentPane(new MyPanel( )); // �� �г� �̿��Ͽ� �׷��� ó��
		add(new MyPanel( )); // �� ����� ����, �� �г� �̿��Ͽ� �׷��� ó��
		setSize(300, 150);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		Point pointStart = null;
		Point pointEnd = null;
		{
			addMouseListener(new MouseAdapter( ) {
				public void mousePressed(MouseEvent e) {
					pointStart = e.getPoint( );
					mouseX = e.getX( ); // mouseX = e.getPoint( ).x; ����
					mouseY = e.getY( ); // mouseX = e.getPoint( ).y; ����
					mouseDragged = false;
					requestFocus( );
					repaint( );
				}

				public void mouseReleased(MouseEvent e) {
					pointStart = null;
				}
			});

			addMouseMotionListener(new MouseMotionAdapter( ) {
				public void mouseMoved(MouseEvent e) {
					pointEnd = e.getPoint( );
				}

				public void mouseDragged(MouseEvent e) {
					pointEnd = e.getPoint( );
					draggedMouseX = e.getX( );
					draggedMouseY = e.getY( );
					mouseDragged = true;
					repaint( );
				}
			});
		}

		public void paint(Graphics g) {
			super.paint(g);
			if (pointStart != null) {
				g.setColor(Color.PINK);
				g.drawRect(mouseX, mouseY, pointEnd.x, pointEnd.y);
			}
		}
	};
}

public class E1202 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}