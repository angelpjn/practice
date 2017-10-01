class Score {
	String id; // �й�
	String name; // �̸�
	int score[ ] = new int[3]; // 3���� ���� ����
	int sum; // ����
	float average; // ���
	char grade[ ] = new char[3]; // ����

	Score( ) { 	}
	Score(String name, int kor, int eng, int math) {
		this.name = name;
		score[0] = kor;
		score[1] = eng;
		score[2] = math;
	}

	int total( ) {
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}

	float average( ) {
		average = (float) sum / score.length;
		return average;
	}

	void credit( ) {
		for (int a = 0; a < score.length; a++) {
			switch (score[a] / 10) {
			case 10:
			case 9: grade[a] = 'A'; break;
			case 8: grade[a] = 'B'; break;
			case 7: grade[a] = 'C'; break;
			case 6: grade[a] = 'D'; break;
       	default: grade[a] = 'F'; 	break;
			}
		}
	}

	void display( ) {
		System.out.println("  �̸� : ���� \t����\t���� ����(����)");
		System.out.println("-----------------------------------");
		System.out.print(" " + name + ",");
		for (int a = 0; a < score.length; a++) {
			System.out.print("\t" + score[a]);
			System.out.print("(" + grade[a] + ") ");
		}
		System.out.println("\n-----------------------------------");
		System.out.print("\t���� : " + sum + ",");
		System.out.printf("\t��� : %.2f", average);
		System.out.println("\n-----------------------------------\n");
	}
}

public class E0511 {
	public static void main(String[ ] args) {
		Score s = new Score("ȫ�浿", 95, 88, 77);
		s.credit( ); // ����
		s.total( ); // ����
		s.average( ); // ���
		s.display( ); // ȭ�鿡 ��� ���
	}
}