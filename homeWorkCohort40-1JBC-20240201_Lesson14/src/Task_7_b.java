import java.util.Random;
import java.util.Scanner;

public class Task_7_b {
    public static void main(String[] args) {
        // Создаём scanner для того, чтобы спросить у пользователя длину массива.
        Scanner scanner = new Scanner(System.in);

        // Создаём переменную для определения нашего массива.
        System.out.println("Введите желаемую длину массива:");
        int size = scanner.nextInt();

        // Создаём массив с длиной полученной от пользователя.
        int[] array = new int[size];

        // Наполняем наш массив рандомными числами.
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        // Распечатываем наш массив.
        System.out.println("Массив случайных чисел:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Создаём переменные для того, чтобы пройтись по нашему массиву и присвоить,
        // только что созданным переменным: А) переменная максимального значения;
        // Б) переменная максимального индекса.
        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue){
                maxValue = array[i];
                maxIndex = i;
            }
        }
        // Распечатываем элемент с максимальным значением.
        // Распечатываем номер индекса максимального значения.
        System.out.println("Максимальный элемент массива: " + maxValue);
        System.out.println("Индекс максимального элемента: " + maxIndex);

        // Создаём переменную для подсчёта суммы всех значений нашего массива.
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // Распечатываем значение суммы нашего массива.
        System.out.print("Сумма значений массива: " + sum);
        System.out.println();

        // Создаём переменную для того, чтобы пройтись по нашему массиву и отобрать
        // все элементы с максимальным значением
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue){
                count++;
            }
        }
        // Создаём массив со всеми элементами максимального значения
        int[] maxIndexes = new int[count];
        int currentCount = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == maxValue){
                maxIndexes[currentCount] = i;
                currentCount++;
            }
        }
        // Распечатываем массив с максимальными значениями
        System.out.print("Индексы максимального элемента: ");
        for (int i = 0; i < maxIndexes.length; i++) {
            System.out.print(maxIndexes[i] + " ");
        }
        System.out.println();
    }
}