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

			// 이미지의 크기/2 으로 축소한 메모리 이미지 크기를 구성
			BufferedImage tmp = new BufferedImage(120, 120, Image.SCALE_SMOOTH);
			Graphics2D g = tmp.createGraphics(); // 메모리이미지에서 Graphics2D 얻기
			g.drawImage(resize, 0, 0, null); // 메모리 이미지에 그림을 그리기
			g.dispose(); // 해당 Graphics 종료
			// 메모리 이미지를 파일로 저장
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
