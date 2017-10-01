import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;


class MyFrame {
	String fileName = "c:/work/image/flower";
	public MyFrame() {
		try {
			Image org = ImageIO.read(new File(fileName + ".jpg"));
			Image resize = org.getScaledInstance(120, 120, Image.SCALE_SMOOTH);

			// �̹����� ũ��/2 ���� ����� �޸� �̹��� ũ�⸦ ����
			BufferedImage tmp = new BufferedImage(120, 120, Image.SCALE_SMOOTH);
			Graphics2D g = tmp.createGraphics(); // �޸��̹������� Graphics2D ���
			g.drawImage(resize, 0, 0, null); // �޸� �̹����� �׸��� �׸���
			g.dispose(); // �ش� Graphics ����
			// �޸� �̹����� ���Ϸ� ����
			ImageIO.write(tmp, "jpg", new File(fileName + "0.jpg"));
			ImageIO.write(tmp, "gif", new File(fileName + "0.gif"));
			ImageIO.write(tmp, "png", new File(fileName + "0.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
public class Pr1205 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
