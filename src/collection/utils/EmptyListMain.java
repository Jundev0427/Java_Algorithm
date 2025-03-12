package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //빈 불변 리스트 생성
        List<Object> List3 = Collections.emptyList();
        List<Object> List4 = List.of();

        System.out.println("List3 = " + List3.getClass());
        System.out.println("List4 = " + List4.getClass());

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(arr);
        list.set(0, 100);
        System.out.println("list = " + list);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
