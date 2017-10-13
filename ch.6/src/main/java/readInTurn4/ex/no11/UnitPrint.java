
package readInTurn4.ex.no11;

public class UnitPrint {
    public static void main(String[] args) {
        Unit unit = new Unit();
        unit.name = "박정남";
        unit.militaryType = "해병대";
        unit.idNum = 3735;
        unit.sal = 14000;
        unit.age = 35;

        System.out.println(unit.area(3735));
        System.out.println(unit.volume(35));
        System.out.println(unit);
    }
}