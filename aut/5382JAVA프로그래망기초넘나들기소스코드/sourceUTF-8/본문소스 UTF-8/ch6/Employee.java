abstract class Person { // 추상 클래스
	private String name;

	public Person(String nm) {
		this.name = nm;
	}

	public abstract void info( ); // 추상 메서드(구현 몸체 { } 없기 때문

	@Override 	// 슈퍼 클래스에 존재하지 않은 메서드를 오버라이딩시 오류
	public String toString( ) {  // 이 메서드는 클래스 멤버 출력 형태 오버라이딩
		return "이름= " + this.name;
	}
}

public class Employee extends Person { // Person 상속
	private int empId;

	public Employee(String nm, int id) {
		super(nm);
		this.empId = id;
	}

	@Override
	public void info( ) {  // 추상 메서드는 오버라이딩하여 구현해야 함
		System.out.println(" -- 올해 입사한 신입사원!");
	}

	@Override
	public String toString( ) { // 이 메서드는 클래스 멤버 출력 형태 오버라이딩
		return super.toString( ) + ":: 사번= " + empId;
	}

	public static void main(String args[ ]) { // coding in terms of abstract
		Person hong = new Employee("홍 길동", 20300001);
		System.out.println(hong);  // hong.toString( )과 동일, toString( ) 호출
		hong.info( );
	}
}