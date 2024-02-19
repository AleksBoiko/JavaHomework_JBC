import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте!");
        System.out.println("Введите пожалуйста число от 1 до 7");
        byte numberOfTheUser = scanner.nextByte();

        if (numberOfTheUser > 0 && numberOfTheUser <= 7) {
            switch (numberOfTheUser) {
                case 1:
                    System.out.println("Этот день понедельник (рабочий день) ");
                    break;
                case 2:
                    System.out.println("Этот день вторник (рабочий день) ");
                    break;
                case 3:
                    System.out.println("Этот день среда (рабочий день) ");
                    break;
                case 4:
                    System.out.println("Этот день четверг (рабочий день) ");
                    break;
                case 5:
                    System.out.println("Этот день пятница (рабочий день) ");
                    break;
                case 6:
                    System.out.println("Этот день суббота (выходной день) ");
                    break;
                case 7:
                    System.out.println("Этот день воскресенье (выходной день) ");
                    break;
            }
        } else {
            System.err.println("Вы ввели неправильную цифру, идите в школу!!!");
        }
    }
}
