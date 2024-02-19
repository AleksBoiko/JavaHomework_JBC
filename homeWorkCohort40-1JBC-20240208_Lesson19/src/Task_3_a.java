import java.util.Random;

public class Task_3_a {
    public static void main(String[] args) {

        int[] array = new int[8];
        Random random = new Random();

        // Заполнение массива рандомными числами от 1 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Изначальный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " / ");
        }

        System.out.println();
        System.out.println("-".repeat(32));
        System.out.println("Отсортированный массив");
        
        // Сортировка массива по убыванию
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // Вывод массива на экран
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " / ");
        }
    }
}
