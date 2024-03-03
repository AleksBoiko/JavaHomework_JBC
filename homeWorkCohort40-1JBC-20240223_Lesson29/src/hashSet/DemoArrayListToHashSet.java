package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DemoArrayListToHashSet {
    public static void main(String[] args) {
        List<Integer> integerArrayListWithDuplicates = new ArrayList<>();

        integerArrayListWithDuplicates.add(5);
        integerArrayListWithDuplicates.add(1);
        integerArrayListWithDuplicates.add(3);
        integerArrayListWithDuplicates.add(2);
        integerArrayListWithDuplicates.add(4);
        integerArrayListWithDuplicates.add(5);
        integerArrayListWithDuplicates.add(3);
        integerArrayListWithDuplicates.add(8);
        integerArrayListWithDuplicates.add(7);

        System.out.println("Изначальный список элементов: ");
        printList(integerArrayListWithDuplicates);
        System.out.println("-".repeat(36));

        HashSet<Integer> integerHashSetWithoutDuplicates = new HashSet<>(integerArrayListWithDuplicates);
        System.out.println("Список элементов без дубликатов: ");
        printHashSet(integerHashSetWithoutDuplicates);
        System.out.println("-".repeat(36));

        integerHashSetWithoutDuplicates.add(6);
        integerHashSetWithoutDuplicates.add(9);

        List<Integer> integerListWithoutDuplicates = new ArrayList<>(integerHashSetWithoutDuplicates);
        System.out.println("Список с добавленными элементами:");
        printList(integerListWithoutDuplicates);
        System.out.println("=".repeat(36));
    }
    public static void printList (List<Integer> integerList){
        for (Integer i : integerList){
            System.out.print(i + " / ");
        }
        System.out.println();
    }
    public static void printHashSet (HashSet<Integer> integerHashSet){
        for (Integer i : integerHashSet){
            System.out.print(i + " / ");
        }
        System.out.println();
    }
}
