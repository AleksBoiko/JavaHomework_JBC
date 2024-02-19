import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста строку:");
        String userStr = scanner.nextLine();

        // Очистка строки от неправильных пробелов.
        String firstStr = userStr.replaceAll("\\s+", " ");

        // Очистка строки от знаков препинания.
        String secondStr = firstStr.replaceAll("\\p{Punct}", " ");

        // Считаем количество слов по пробелу.
        int wordCount = secondStr.split(" ").length;

        System.out.println("Вы ввели: " + userStr);
        System.out.println("Очистка строки от неправильных пробелов: " + firstStr);
        System.out.println("Очистка строки от знаков препинания: " + secondStr);
        System.out.println("Количество слов: " + wordCount);
    }
}
