package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "1000"}, {"Spring", "20000"}, {"JPA", "3000"}};
        HashMap<String, Integer> products = new HashMap<>();

        for (String[] product : productArr) {
            products.put(product[0], Integer.valueOf(product[1]));
        }

        System.out.println("products = " + products);
    }
}
