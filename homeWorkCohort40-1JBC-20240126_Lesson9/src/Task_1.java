import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте!");
        System.out.println("Введите пожалуйста число от 1 до 3");
        int numberOfUser = scanner.nextInt();

        if (numberOfUser == 1){
            System.out.println("Вы ввели цифру 1");
        } else if (numberOfUser == 2) {
            System.out.println("Вы ввели цифру 2");
        } else if (numberOfUser == 3) {
            System.out.println("Вы ввели цифру 3");
        } else {
            System.err.println("Вы ввели неправильную цифру.");
        }
    }
}
