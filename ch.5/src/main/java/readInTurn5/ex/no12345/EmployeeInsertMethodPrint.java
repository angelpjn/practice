
package readInTurn5.ex.no12345;

public class EmployeeInsertMethodPrint {
	public static void main(String[] args) {
		EmployeeInsertMethod emp = new EmployeeInsertMethod("박정남", "서울시", "010-8618");
		System.out.println(emp);
		emp.getInfo();
	}
	
}