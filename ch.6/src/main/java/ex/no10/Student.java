
package ex.no10;

class Student implements Site {
    String idNum;
    String name;
    int age;
    String grade;
    
    public Student() {}

    public Student(String idNum, String name, int age, String grade) {
        this.idNum = idNum;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public void buy() {
        System.out.printf("학번 : %s\n성명 : %s\n나이 : %d\n학점 : %s\n", this.idNum, this.name, this.age, this.grade);
    }
}    