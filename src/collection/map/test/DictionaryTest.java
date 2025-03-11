package collection.map.test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dictionary = new HashMap<>();

        System.out.println("=== 단어 입력 단계 ===");

        while (true) {
            System.out.print("영어 단어를 입력하세요 (종류는 'q'): ");
            String english = scanner.nextLine();

            if (english.equals("q")) {
                break;
            }

            System.out.print("한국 뜻을 입력하세요: ");
            String korean = scanner.nextLine();
            System.out.println(korean);

            dictionary.put(english, korean);
        }

        System.out.println("=== 단어 검색 단계 ===");

        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종류는 'q'): ");
            String english = scanner.nextLine();

            if (english.equals("q")) {
                break;
            }

            String korean = dictionary.get(english);

            if (korean != null) {
                System.out.println("한국 뜻은 " + korean + "입니다.");
            }

            if (korean == null){
                System.out.println("일치하는 단어가 없습니다.");
            }
        }
    }
}
