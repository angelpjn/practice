import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class MyFrame extends JFrame {

	MyFrame( ) {
		setTitle("Border Test");
		JPanel content = (JPanel) getContentPane( );
		content.setLayout(new GridLayout(0, 4, 5, 5));

		JPanel p = new JPanel( );
		p = new JPanel( );
		p.setBorder(new LineBorder(Color.BLACK, 3, true));
		p.add(new JLabel("LineBorder"));
		content.add(p);

		p = new JPanel( );
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		p.add(new JLabel("EmptyBorder"));
		content.add(p);

		p = new JPanel( );
		p.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		p.add(new JLabel("EtchedBorder"));
		content.add(p);

		p = new JPanel( );
		p.setBorder(new BevelBorder(BevelBorder.RAISED));
		p.add(new JLabel("BevelBorder"));
		content.add(p);

		p = new JPanel( );
		p.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		p.add(new JLabel("SoftBevelBorder"));
		content.add(p);

		p = new JPanel( );
		p.setBorder(new MatteBorder(new ImageIcon("c:/work/image/cloud.jpg")));
		p.add(new JLabel("MatteBorder"));
		content.add(p);

		p = new JPanel( );
		p.setBorder(new MatteBorder(2, 5, 4, 10, Color.PINK));
		p.add(new JLabel("MatteBorder"));
		content.add(p);

		p = new JPanel( );
		p.setBorder(new TitledBorder(new MatteBorder(new ImageIcon(
				"c:/work/image/flower.jpg")), "Title"));
		p.add(new JLabel("TitledBorder"));
		content.add(p);

		p = new JPanel( );
		TitledBorder top = BorderFactory.createTitledBorder("위");
		top.setTitlePosition(TitledBorder.TOP);
		p.setBorder(new TitledBorder(top, "아래", TitledBorder.RIGHT,
				TitledBorder.BOTTOM));
		p.add(new JLabel("TitledBorder"));
		content.add(p);

		p = new JPanel( );
		Border outsideBorder = new LineBorder(Color.red, 5);
		Border insideBorder = new MatteBorder(2, 4, 8, 10,
				Color.red.brighter( ));
		p.setBorder(new CompoundBorder(outsideBorder, insideBorder));
		p.add(new JLabel("CompoundBorder"));
		content.add(p);

		p = new JPanel( );
		p.setBorder(new TitledBorder(new LineBorder(Color.black, 5), "Title"));
		p.add(new JLabel("TitledBorder"));
		content.add(p);

		pack( );
		setVisible(true);
	}
}

public class MyFrame21 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}