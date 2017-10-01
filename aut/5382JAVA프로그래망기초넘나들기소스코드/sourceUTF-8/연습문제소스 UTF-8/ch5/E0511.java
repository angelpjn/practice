class Score {
	String id; // 학번
	String name; // 이름
	int score[ ] = new int[3]; // 3개의 과목 점수
	int sum; // 총점
	float average; // 평균
	char grade[ ] = new char[3]; // 학점

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
		System.out.println("  이름 : 국어 \t영어\t수학 점수(학점)");
		System.out.println("-----------------------------------");
		System.out.print(" " + name + ",");
		for (int a = 0; a < score.length; a++) {
			System.out.print("\t" + score[a]);
			System.out.print("(" + grade[a] + ") ");
		}
		System.out.println("\n-----------------------------------");
		System.out.print("\t총점 : " + sum + ",");
		System.out.printf("\t평균 : %.2f", average);
		System.out.println("\n-----------------------------------\n");
	}
}

public class E0511 {
	public static void main(String[ ] args) {
		Score s = new Score("홍길동", 95, 88, 77);
		s.credit( ); // 학점
		s.total( ); // 총점
		s.average( ); // 평균
		s.display( ); // 화면에 결과 출력
	}
}