
package nonEx;

public class VarScore {
    int varReturn(int a) {
        a++;
        return a;
    }

    int varReturn2(int a) {
        ++a;
        return a;
    }

    public static void main(String[] args) {

        int a = 1;
        VarScore obj = new VarScore();

        obj.varReturn(a);
        System.out.println(a);

        a = obj.varReturn(a);
        System.out.println(a);

        a = 1;
    
        obj.varReturn2(a);
        System.out.println(a);

        a = obj.varReturn2(a);
        System.out.println(a);
    }
}