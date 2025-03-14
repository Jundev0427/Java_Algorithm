package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class JavaIterableMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        printAll(list.iterator());
        foreach(list);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
//        printAll(set.iterator());
        foreach(set);
    }


    private static void printAll(Iterator<Integer> iterator) {
        System.out.println(iterator.getClass());

        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }

    private static<E> void foreach(Iterable<E> iterable) {
        System.out.println(iterable.getClass());

        for (E i : iterable) {
            System.out.println("i = " + i);
        }
    }
}
