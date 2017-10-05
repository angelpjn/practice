
package nonEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Java");
        arrayList.add("Oracle");
        arrayList.add("Sun");

        System.out.println("#1 리스트 요소 : " + arrayList);

        arrayList.add(0, "DB");
        arrayList.add(1, "C++");
        System.out.println("#2 리스트 요소 : " + arrayList);

        Collections.sort(arrayList);

        System.out.println("#3 정렬 후 리스트 요소 : ");
        for( int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
    }
}