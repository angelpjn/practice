
package ex.no11;

class Unit implements Box, Cube {

    String name, militaryType;
    int idNum, sal, age;

    public Unit() {}
    public Unit(String name, String mT, int id, int sal, int age) {
        this.name = name;
        this.militaryType = mT;
        this.idNum = id;
        this.sal = sal;
        this.age = age;
    }

    public int area(int value) {
        return value;
    }

    public int volume(int value) {
        return value;
    }

    public String toString() {
        return ("이름 : " + this.name + "\n군종 : " + this.militaryType + "\n월급 : " + this.sal);
    }

}
