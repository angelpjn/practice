
package ex;

class Manager {
    String name;
    String address;
    String telephone;
    String job;

    Manager(String n, String a, String p, String j) {
        this.name = n;
        this.address = a;
        this.telephone = p;
        this.job = j;
            
    }

        public void info() {
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.telephone);
        System.out.println(this.job);
    }
}

public class No5 {
    public static void main(String[] args) {
        Manager mg = new Manager("홍길동", "남양", "100314", "의적");
        mg.info();

    }
}

