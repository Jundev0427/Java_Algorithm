package collection.compare;

import java.util.LinkedList;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser member1 = new MyUser("a", 30);
        MyUser member2 = new MyUser("b", 20);
        MyUser member3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(member1);
        treeSet1.add(member2);
        treeSet1.add(member3);

        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(member1);
        treeSet2.add(member2);
        treeSet2.add(member3);

        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
    }
}
