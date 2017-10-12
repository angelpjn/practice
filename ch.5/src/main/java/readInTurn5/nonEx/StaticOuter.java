
package readInTurn5.nonEx;

public class StaticOuter {
	private int outerM = 0;
	private static int outerDf = 0;
	
	public static class StaticInner {
		private int innerMember = 20;
		private static int outerDf = 3;
		final int LV = 123;
		
		public static void nestedM() {
			
		}
		
		public void method() {
			System.out.println("outerDf = " + outerDf);
			System.out.println("this.outerDf = " + this.outerDf);
			System.out.println("LV = " + LV);
		}
	}
	
	public static void main(String[] args) {
		StaticOuter.StaticInner obj = new StaticOuter.StaticInner();
		obj.method();
		System.out.println(StaticOuter.StaticInner.outerDf);
		                                                                                    
		StaticOuter obj2 = new StaticOuter();
		System.out.println(obj2.outerM + "\n    " + outerDf);
	}
	
}