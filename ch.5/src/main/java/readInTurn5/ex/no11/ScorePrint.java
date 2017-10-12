
package readInTurn5.ex.no11;

public class ScorePrint {
	
	public static void main(String[] args) {

		Score score = new Score("27850", "임", 50, 90, 70);
		
		score.computeSum();
		score.computeAvg();
		System.out.println(score);
		switch (score.sum / 10) {
		case 21 : System.out.println("장학금 대상 학생");
		break;
		case 10 : ;
		case 9 : System.out.println('A');
		break;
		case 8 : System.out.println('B');
		break;
		default : System.out.println("F");
		break;
		}
	}
	
}