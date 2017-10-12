
package readInTurn5.ex.no11;

class Score {
	String idNum, name;
	int kor, eng, math, sum;
	double avg;
	
	public Score() {}

	public Score(String idNum, String name, int kor, int eng, int math) {
		this.idNum = idNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;		
	}
	
	int computeSum() {
		return sum = kor + eng + math;
	}
	
	double computeAvg() {
		return avg = (double)sum / 3;
	}
	
	public String toString() {
		return ("학번 : " + idNum + "\n이름 : " + name + "\n국어점수 : " + kor + "\n영어점수 : " + eng
				+ "\n수학점수 : " + math + "\n총 점 : " + sum + "\n평균 점수 : " + avg);
	}
	
}