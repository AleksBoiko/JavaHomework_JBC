package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayListString {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Vasja");
        students.add("Wadim");
        students.add("Fedja");
        students.add("Olga");
        students.add("Alina");

        System.out.println("--------------Выводим список студентов как есть---------------");
        printArrayList(students);

        System.out.println("---------Выводим список студентов в обратном порядке----------");
        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.print(students.get(i) + " / ");
        }
        System.out.println();

        System.out.println("---------Выводим студентов в алфавитном прямом порядке--------");
        Collections.sort(students);
        printArrayList(students);
        System.out.println();

        System.out.println("--------Выводим студентов в алфавитном обратном порядке-------");
        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.print(students.get(i) + " / ");
        }
        System.out.println();
        System.out.println("=".repeat(62));

    }
    public static void printArrayList (ArrayList<String> students){
        for (String s : students){
            System.out.print(s + " / ");
        }
        System.out.println();
    }
}
