
package ex;

class Cinema {
    String title;
    String movieRating;
    double cost;
    String called;
    int minutes;

    Cinema() {
    }
}

public class No7 {
    public static void main(String[] args) {
        Cinema cin = new Cinema();
        cin.title = "대장 김창수";
        cin.movieRating = "15세 관람가";
        cin.cost = 10000;
        cin.called = "10월 2일 개봉";
        cin.minutes = 200;

        System.out.printf("제목 : %s\n\n영화 등급 : %s\n가격 : %.1f\n상영 시작일 : %s\n상영 시간 : %d 분\n", cin.title, cin.movieRating, cin.cost, cin.called, cin.minutes);
    }
}