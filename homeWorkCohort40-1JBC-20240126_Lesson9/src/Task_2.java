import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте и добро пожаловать в поиск максимального числа");
        System.out.println("Введите желаемую цифру 1");
        int number1 = scanner.nextInt();
        System.out.println("Введите желаемую цифру 2");
        int number2 = scanner.nextInt();
        System.out.println("Введите желаемую цифру 3");
        int number3 = scanner.nextInt();
        System.out.println("Введите желаемую цифру 4");
        int number4 = scanner.nextInt();

        if (number1 > number2 && number1 > number3 && number1 > number4){
            System.out.println("В Вашем случае максимальное число " + number1);
        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            System.out.println("В Вашем случае максимальное число " + number2);
        } else if (number3 > number1 && number3 > number2 && number3 > number4) {
            System.out.println("В Вашем случае максимальное число " + number3);
        } else {
            System.out.println("В Вашем случае максимальное число " + number4);
        }
    }
}
