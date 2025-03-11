package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';

        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        //hash
        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"B\") = " + hashCode("B"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB"));

        //hashIndex
        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(hashCode(\"B\")) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(hashCode(\"AB\")) = " + hashIndex(hashCode("AB")));
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;

        for (char s : charArray) {
            sum += (int) s;
        }

        return sum;
    }
}
