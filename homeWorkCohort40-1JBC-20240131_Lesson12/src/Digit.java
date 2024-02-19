import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int cont = 0;

        System.out.println("Введите числа (значение 0 для завершения программы):");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            cont++;
        }
        double average = (double) sum / cont;

        System.out.println("Сумма всех чисел: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
