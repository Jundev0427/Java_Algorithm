package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();

        while (iterator.hasNext()) {
            Integer val = iterator.next();
            System.out.println("val = " + val);
        }

        System.out.println("for-each");
        for (int value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
