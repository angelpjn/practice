
package readInTurn5.ex.no10;

public class ScorePrint {
	public static void main(String[] args) {
		
		Score score = new Score("27850", "임", 50, 90, 70);
		
		score.computeSum();
		score.computeAvg();
		System.out.println(score);
	}
	
}