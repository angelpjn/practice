
package nonEx;

abstract class Person {
    private String name;

    public Person(String nm) {
        this.name = nm;
    }

    public abstract void info();

    @Override
    public String toString() {
        return "이름 = " + this.name;
    }
}

public class Employee extends Person {
    private int empId;

    public Employee(String nm, int id) {
        super(nm);
        this.empId = id;
    }

    @Override
    public void info() {
        System.out.println(" -- 올해 입사한 신입사원!");
    }

    @Override
    public String toString() {
        return super.toString() + "\n사번 = " + empId;
    }
    
    public static void main(String[] args) {
        Person hong = new Employee("홍길동", 20300001);
        hong.info();
        System.out.println(hong);

    }
}