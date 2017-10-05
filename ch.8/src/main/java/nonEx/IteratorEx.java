
package nonEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        String seasons[] = {"spring", "summer", "autumn", "winter"};

        for(int i = 0; i < seasons.length; i++) {
            obj.add(seasons[i]);
        }

        obj.add("C");
        obj.add("A");
        obj.add("N");

        System.out.println("#1 iterator loop(순방향으로 꺼내 참조) : ");
        Iterator<String> itr = obj.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.print("#2 for : ");
        for(int i = 0; i < obj.size(); i++) {
            System.out.print(obj.get(i) + " ");
        }
        System.out.println();

        System.out.print("#3 for advance : ");
        for (String objObj : obj) {
            System.out.println(objObj + " ");
        }
        System.out.println();

        System.out.println("#4 while : ");
        int j = 0;
        while(j < obj.size()) {
            System.out.print(obj.get(j) + " ");
            j++;
        }
        System.out.println();

        ListIterator<String> litr = obj.listIterator();
        while (litr.hasNext()) {
            litr.set(litr.next() + " ");
        }
        System.out.println("Previous Index : " + litr.previousIndex());
        System.out.println("Next Index : " + litr.nextIndex());
        
        System.out.print("ListIterator 요소 : ");
        itr = obj.iterator(); 
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.print("#6 iterator liip(역순으로 꺼내 참조) : ");
        while(litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
        System.out.println();
    }
}