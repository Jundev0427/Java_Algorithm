package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ItemPriceTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        ArrayList<String> result = new ArrayList<>();

        for (Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(1000)){
                result.add(entry.getKey());
            }
        }
        System.out.println("result = " + result);
    }
}
