import java.util.Scanner;

public class Task_1_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте!");
        System.out.println("Введите пожалуйста число от 1 до 3");
        int numberOfUser = scanner.nextInt();
        if (numberOfUser > 0 && numberOfUser <= 3){
            switch (numberOfUser) {
                case 1:
                    System.out.println("Вы ввели цифру 1");
                    break;
                case 2:
                    System.out.println("Вы ввели цифру 2");
                    break;
                case 3:
                    System.out.println("Вы ввели цифру 3");
                    break;
            }
        } else {
            System.err.println("Вы ввели неправильную цифру.");
        }
    }
}
