package arrayList;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class DemoLinkedListInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите желаемую длину списка:");
        int size = scanner.nextInt();

        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            integerLinkedList.add(random.nextInt(100) + 1);
        }
        System.out.println("Выводим на экран наш исходной список:");
        printLinkedList(integerLinkedList);

        int maxNumber = integerLinkedList.get(0);
        int minNumber = integerLinkedList.get(0);
        for (int i = 0; i < size; i++) {
            if (integerLinkedList.get(i) < minNumber){
                minNumber = integerLinkedList.get(i);
            }
            if (integerLinkedList.get(i) > maxNumber){
                maxNumber = integerLinkedList.get(i);
            }
        }
        System.out.println("Элемент с максимальным значением в нашем списке: " + maxNumber);
        System.out.println("Элемент с минимальным значением в нашем списке: " + minNumber);
        System.out.println("-".repeat(80));

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (integerLinkedList.get(j) > integerLinkedList.get(j + 1)){
                    int temp = integerLinkedList.get(j);
                    integerLinkedList.set(j, integerLinkedList.get(j + 1));
                    integerLinkedList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Выводим на экран наш отсортированный по возрастанию список:");
        printLinkedList(integerLinkedList);

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (integerLinkedList.get(j) < integerLinkedList.get(j + 1)){
                    int temp = integerLinkedList.get(j);
                    integerLinkedList.set(j, integerLinkedList.get(j + 1));
                    integerLinkedList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Выводим на экран наш отсортированный по убыванию список:");
        printLinkedList(integerLinkedList);
        System.out.println("=".repeat(80));

    }
    public static void printLinkedList (LinkedList<Integer> integerLinkedList){
        for (int i : integerLinkedList){
            System.out.print(i + " / ");
        }
        System.out.println();
        System.out.println("-".repeat(80));
    }
}