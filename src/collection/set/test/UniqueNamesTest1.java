package collection.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        HashSet<Integer> inputSet = new HashSet<>(List.of(inputArr));
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>(List.of(inputArr));
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(inputArr));

        System.out.println("inputSet = " + inputSet);
        System.out.println("linkedSet = " + linkedSet);
        System.out.println("treeSet = " + treeSet);
    }
}
