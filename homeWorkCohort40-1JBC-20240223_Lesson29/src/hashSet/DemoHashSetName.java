package hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class DemoHashSetName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Александр");
        stringHashSet.add("Алексей");
        stringHashSet.add("Олег");
        stringHashSet.add("Евгений");
        stringHashSet.add("Алина");
        stringHashSet.add("Евгения");
        stringHashSet.add("Александр");
        stringHashSet.add("Екатерина");
        stringHashSet.add("Ангелина");
        stringHashSet.add("Алина");

        System.out.println("Изначальный список имён:");
        for (String n : stringHashSet){
            System.out.print(n + " / ");
        }
        System.out.println();
        System.out.println("-".repeat(80));

        System.out.println("Количество уникальных имён: " + stringHashSet.size());
        System.out.println("-".repeat(80));

        System.out.println("Введите имя для проверки: ");
        String name = scanner.nextLine();
        if (stringHashSet.contains(name)){
            System.out.println("Список содержит имя: " + name);
        } else {
            System.err.println("Список не содержит имя: " + name);
        }
        System.out.println("=".repeat(80));
    }
}
