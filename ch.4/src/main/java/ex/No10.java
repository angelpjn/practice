package ex;

public class No10{
    public static void main(String[] args){
        String [][] str = {{"가", "갸", "거", "겨"},
                           {"나", "냐", "너", "녀", "노"},
                           {"다", "댜", "더", "뎌", "도", "됴", "두", "듀", "드", "디"}};

        for(int i = 0; i < str.length; i++){
            System.out.println("str["+i+"]+ 배열 놈들 : ");

            for(int j = 0; j < str[i].length; j++){
                System.out.printf("%s", str[i][j]);
            }
            System.out.println();
            System.out.println();
        }
    }
}