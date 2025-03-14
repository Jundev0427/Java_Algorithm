package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);

        System.out.println(studentMap);

        //  특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        System.out.println("=== keySet 활용 ===");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("integer = " + value);
        }

        System.out.println("=== entrySet 활용 ===");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("key = " + key);
            System.out.println("value = " + value);
        }

        System.out.println("=== values 활용 ===");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}
