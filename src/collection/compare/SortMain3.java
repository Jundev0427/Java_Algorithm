package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser member1 = new MyUser("a", 30);
        MyUser member2 = new MyUser("b", 20);
        MyUser member3 = new MyUser("c", 10);

        MyUser[] array = {member1, member2, member3};
        System.out.println("기본데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator 정렬");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator 반대 정렬");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
    }
}
