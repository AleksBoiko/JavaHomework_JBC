import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите пожалуйста желаемое число больше числа 3");
        int n = scanner.nextInt();

        while (n <= 3){
            System.out.println("Введите пожалуйста желаемое число больше числа 3");
            n = scanner.nextInt();
        }

        int[] array1 = new int[n];
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            array1[i] = random.nextInt(n + 1);
            if (array1[i] % 2 == 0){
                evenCount++;
            }
        }

        System.out.println("Исходной массив:");
        for (int i : array1){
            System.out.print(i + " / ");
        }
        System.out.println();

        if (evenCount > 0){
            int[] array2 = new int[evenCount];
            int index = 0;

            for (int i = 0; i < n; i++) {
                if (array1[i] % 2 == 0){
                    array2[index] = array1[i];
                    index++;
                }
            }
            System.out.println("Массив чётных чисел");
            for (int i : array2){
                System.out.print(i + " / ");
            }
            System.out.println();
        } else {
            System.out.println("В исходном массиве нет чётных чисел");
        }
    }
}
