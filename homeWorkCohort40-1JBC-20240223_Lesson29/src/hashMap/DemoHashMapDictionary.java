package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemoHashMapDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("cat", "кот");
        dictionary.put("dog", "собака");
        dictionary.put("elephant", "слон");
        dictionary.put("kangaroo", "кенгуру");
        dictionary.put("mouse", "мышь");
        dictionary.put("parrot", "попугай");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово на английском языке: ");
        String word = scanner.nextLine();

        if (dictionary.containsKey(word)){
            System.out.println("Перевод слова \"" + word + "\": " + dictionary.get(word));
            System.out.println("-".repeat(60));
        } else {
            System.err.println("К сожалению такого слова нет в словаре.");
            System.out.println("-".repeat(60));
        }
        dictionary.remove(word);

        System.out.println("Выводим обновлённый список слов на экран");
        System.out.println();
        for (Map.Entry<String, String> stringEntry : dictionary.entrySet()){
            System.out.println(stringEntry.getKey() + " - " + stringEntry.getValue());
        }
        System.out.println("=".repeat(60));


    }
}
