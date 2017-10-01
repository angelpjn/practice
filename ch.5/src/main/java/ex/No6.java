
package ex;

class User {
    String id;
    String userName;
    String password;

    User(String i, String u, String p) {
        this.id = i;
        this.userName = u;
        this.password = p;
    }

    void re() {
        System.out.printf("%s, %s, %s\n", this.id, this.userName, this.password);
    }
}

public class No6 {
    public static void main(String[] args) {
        User user = new User("hwalbindang", "홍길동", "hobuhohyung");

        user.re();
    }
}

