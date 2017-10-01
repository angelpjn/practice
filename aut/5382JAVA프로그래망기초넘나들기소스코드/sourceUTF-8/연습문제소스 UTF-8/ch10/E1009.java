import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Ball implements Cloneable {
	int radius; // Radius of ball (pixels).
	Point center; // Center of ball.

	Ball(int radius, Point center) {
		this.radius = radius;
		this.center = center;
	}
	
	public Object clone() {
		Ball copy = null;
		try {
			copy = (Ball) super.clone();
		} catch (CloneNotSupportedException e) {
			System.exit(1);
		}
		copy.center = new Point(center);
		return copy;
	}

	boolean position(Point p) {
		return (center.x - p.x) * (center.x - p.x) + (center.y - p.y)
				* (center.y - p.y) < radius * radius;
	}

	boolean boundary(Point p) {
		double d = Math.sqrt((center.x - p.x) * (center.x - p.x)
				+ (center.y - p.y) * (center.y - p.y));
		return Math.abs(d - radius) < 1.5;
	}

	int dist(Point p) {
		return (int) Math.round(Math.sqrt((center.x - p.x) * (center.x - p.x)
				+ (center.y - p.y) * (center.y - p.y)));
	}

	void move(int dx, int dy) {
		center.x += dx;
		center.y += dy;
	}

	void draw(Graphics g) {
		g.drawOval(center.x - radius, center.y - radius, 2 * radius, 2 * radius);
		g.fillOval(center.x - radius, center.y - radius, 2 * radius + 1,
				2 * radius + 1);
	}
}

class MyGUI extends JFrame {
	MyGUI() {
		setTitle("Ball Moving");
		setSize(500, 400);
		setResizable(true);
		MousePanel mousePanel = new MousePanel();
		add(mousePanel, BorderLayout.CENTER);
		setVisible(true);
		mousePanel.positionBallAtCenter();
	}
}


class MousePanel extends JPanel {
	Ball ball;
	Ball copyOfBall = null;
	boolean dragOperation;
	Point oldMousePosition = null;
	Cursor defaultCursor = Cursor.getDefaultCursor();
	Cursor crosshairCursor = Cursor
			.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR);
	Cursor moveCursor = Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR);
	Cursor cursor;

	MousePanel() {
		setBackground(Color.WHITE);
		ball = new Ball(20, new Point());
		addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
				Point mousePosition = e.getPoint();
				if (cursor != defaultCursor) {
					oldMousePosition = mousePosition;
					copyOfBall = (Ball) ball.clone();
				}
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}
		});
		
		addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				if (oldMousePosition != null) {
					dragOperation = true;
					Point mousePosition = e.getPoint();
					if (cursor == crosshairCursor) {
						ball.radius = ball.dist(mousePosition);
					} else {
						int dx = e.isAltDown() ? 0 : mousePosition.x
								- oldMousePosition.x;
						int dy = e.isControlDown() ? 0 : mousePosition.y
								- oldMousePosition.y;
						ball.move(dx, dy);
					}
					repaint();
					oldMousePosition = mousePosition;
				}
			}

			public void mouseMoved(MouseEvent e) {
				Point mousePosition = e.getPoint();
				if (ball.boundary(mousePosition))
					cursor = crosshairCursor;
				else if (ball.position(mousePosition))
					cursor = moveCursor;
				else
					cursor = defaultCursor;
				setCursor(cursor);
			}
		});
	}
	
	void positionBallAtCenter() {
		ball.center.x = getWidth() / 2;
		ball.center.y = getHeight() / 2;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ball.draw(g);

		g.setColor(Color.BLACK);
		int verticalPos = getHeight() - 100;
	}
}

public class E1009 {
	public static void main(String args[]) {
		new MyGUI();
	}
}