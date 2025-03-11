package collection.set;


import collection.set.member.Member;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        String searchValue = "A";
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
