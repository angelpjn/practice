import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {  

	public MyFrame( ) {
		super("GridLayout Demo");
		Container pane = getContentPane( );
		pane.setLayout(new GridLayout(4, 5, 10, 10));

		pane.add(new JLabel("Label"));
		pane.add(new JButton("Button"));
		pane.add(new JCheckBox("CheckBox"));
		pane.add(new JRadioButton("RadioButton"));
		pane.add(new JTextField("TextField"));

		JTextArea textArea = new JTextArea( );
		textArea.setText("°á°ú: ");
		textArea.setEditable(false);
		pane.add(textArea);

		add(new JButton("+"));
		add(new JButton("="));

		JButton btn[ ] = new JButton[10];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			add(btn[i]);
		}

		pack( );
		setVisible(true);
	}
}

public class MyFrame7 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}