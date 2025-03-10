package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;

        System.out.println(" == ArrayList 추가 == ");
        addFirst(new ArrayList<>(), size);
        addMiddle(new ArrayList<>(), size); // 찾는데 O(1), 추가(n)

        ArrayList<Integer> arrayList = new ArrayList<>(); // 조회용 데이터
        addLast(arrayList, size); // 찾는데 O(1), 추가(1)

        int loop = 10000;
        System.out.println("== ArrayList 조회 ==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("== MyArrayList 검색 ==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.println(" == LinkedList 추가 == ");
        addFirst(new LinkedList<>(), size);
        addMiddle(new LinkedList<>(), size); // 찾는데 O(n), 추가(1)

        LinkedList<Integer> myLinkedList = new LinkedList<>();
        addLast(myLinkedList, size); // 찾는데 O(n), 추가(1)

        System.out.println("== LinkedList 조회 ==");
        getIndex(myLinkedList, loop, 0);
        getIndex(myLinkedList, loop, size / 2);


        System.out.println("== LinkedList 검색 ==");
        search(myLinkedList, loop, 0);
        search(myLinkedList, loop, size / 2);
        search(myLinkedList, loop, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.addFirst(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간 " + (endTime - startTime) + "ms");
    }

    private static void addMiddle(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간 " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간 " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + " 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + " 계산 시간: " + (endTime - startTime) + "ms");
    }
}
