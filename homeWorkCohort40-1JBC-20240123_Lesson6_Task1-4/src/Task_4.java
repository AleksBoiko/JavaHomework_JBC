import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        String name = "Aleksandrs";
        System.out.println(name);
        System.out.println("-".repeat(50));
        // Тема: создание переменной типа String. Напишите программу в которой создайте переменную типа String
        // и присвойте ей в качестве начального значения ваше имя. Выведете на консоль значение этой переменной.

        String greeting = "Hi " + name;
        System.out.println(greeting);
        System.out.println("-".repeat(50));
        // Тема: Конкатенация строк. Напишите программу в которой создайте переменную типа String и присвойте ей
        // в качестве начального значения ваше имя. Выведете на консоль приветствие типа "Hi YourName".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Enter your name please ");
        String userName = scanner.nextLine();
        //Тема: Считывание строк с консоли. Программа должна спрашивать как зовут пользователя, считывать его имя
        // с консоли и выводить приветствие в виде: "Hello UserName!".

        System.out.println(" Hello " + userName + "!");
    }
}
