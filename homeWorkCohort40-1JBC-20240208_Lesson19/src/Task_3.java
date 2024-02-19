import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];
        System.out.println("Исходной массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        for (int i : array){
            System.out.print(i + " / ");
        }
        System.out.println();
        System.out.println("-".repeat(32));
        System.out.println("Отсортированный массив ");

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " / ");
        }
    }
}
