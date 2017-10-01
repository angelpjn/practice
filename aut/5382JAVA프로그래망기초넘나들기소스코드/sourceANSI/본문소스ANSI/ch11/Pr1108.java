import java.awt.*;
import java.util.*;
import javax.swing.*;

class MyGUI extends JFrame {
	String[ ] fruits = { "사과", "배", "바나나", "귤", "블루베리", "참외", "수박", 
                  "딸기", "감", “포도", "복숭아", "토마토", "파인애플", "망고",                    "멜론", "밤", "대추" };
	String filename1 = "c:/work/image/sunset.jpg";
	String filename2 = "c:/work/image/flower0.gif";
	ImageIcon[ ] images = { new ImageIcon(filename1), 
                         new ImageIcon(filename2) };
	private JList<String> countryList;

	public MyGUI( ) {
		setTitle("JList Demo");
		setLayout(new FlowLayout( ));

		JList<String> fruitList = new JList<>(fruits);
		// JList에 항목 변경(수정,삽입, 삭제) 가능하도록 DefaultListModel 선언
		final DefaultListModel<String> model = new DefaultListModel<>( );
		for (int i = 0, n = fruits.length; i < n; i++) {
			model.addElement(fruits[i]); // 항목 추가
		}
		JList<String> jlist = new JList<>(model); // 변경한 리스트
		jlist.setSelectedIndex(1); // 2번째 항목 선택(0부터 시작하므로)
		System.out.println(fruitList.getSelectedValue( ));
		add(new JScrollPane(jlist), BorderLayout.CENTER); // 스크롤 달기

		model.add(0, "First"); // 첫번째 위치에 삽입
		// model.clear( ); // 리스트 모든 항목 삭제
		model.addElement("Last"); // 삽입

		int size = model.getSize( ); // 리스트 항목 개수 알아내기
		model.insertElementAt("Middle", size / 2); // 중간에 삽입
		model.set(0, "New First"); // 첫번째 내용 변경
		model.setElementAt("New Last", size - 1); // 끝 내용 변경
		// model.remove(0); // 첫번째 항목 삭제

		JList list = new JList( );
		list.setListData(images); // 리스트에 이미지 삽입
		add(list);

		Vector colors = new Vector( );
		JList colorList = new JList(colors);

		colors.addElement("red");
		colors.addElement("green");
		add(colorList);

		pack( );
		setLocationRelativeTo(null); // 프레임 중앙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료
		setVisible(true); // 화면에 보이기
	}
}

public class Pr1108 {
	public static void main(String[ ] args) {
		new MyGUI( ); // 프레임 생성
	}
}