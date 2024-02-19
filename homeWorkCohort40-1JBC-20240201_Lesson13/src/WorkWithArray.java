import java.util.Random;

public class WorkWithArray {
    public static void main(String[] args) {
        // Создаём массив на 8 элементов
        int[] myArray = new int[8];
        Random random = new Random();
        // Заполняем массив случайными числами от 0 до 50
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(50) + 1;
        }
        // Перебираем массив, чтобы вывести на экран
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("-".repeat(34));
        // Нечётные элементы заменяем значением 0
        for (int i = 1; i < myArray.length; i += 2) {
            myArray[i] = 0;
        }
        // Перебираем массив, чтобы вывести на экран
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}