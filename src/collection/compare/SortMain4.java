package collection.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser member1 = new MyUser("a", 30);
        MyUser member2 = new MyUser("b", 20);
        MyUser member3 = new MyUser("c", 10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(member1);
        list.add(member2);
        list.add(member3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 적렬");
        list.sort(null);
//        Collections.sort(list);
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
//        Collections.sort(list, new IdComparator());
        System.out.println(list );
    }
}
