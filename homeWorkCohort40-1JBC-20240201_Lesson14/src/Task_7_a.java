import java.util.Random;
import java.util.Scanner;

public class Task_7_a {
    public static void main(String[] args) {

        // Создаём scanner для того, чтобы спросить у пользователя длину массива.
        Scanner scanner = new Scanner(System.in);

        // запрашиваем у пользователя желаемую длину массива.
        System.out.println("Введите желаемую длину массива");

        // Создаём переменную для определения нашего массива.
        int size = scanner.nextInt();

        // Выводим на экран пользователю длину массива, которую он указал.
        System.out.println("Вы указали длину массива из " + size + " элементов");

        // Создаём массив с длиной указанной пользователем и вызываем метод для заполнения рандомными значениями.
        int[] array = randomArray(size);

        // Создаём переменную для хранения max значения нашего массива и вызываем метод для поиска max значения.
        int maxNumber = getMaxValue(array);

        // Создаём переменную для хранения индекса max значения и вызываем метод для поиска индекса с max значением.
        int maxIndex = getMaxIndex(array);

        // Создаём переменную для хранения суммы всех значений нашего массива и вызываем метод подсчёта.
        int sum = calcSumArray(array);

        // Вызываем метод для распечатки массива.
        printArray(array);
        System.out.println();

        // Выводим на экран максимальный элемент массива.
        System.out.println("Максимальный элемент массива: " + maxNumber);

        // Выводим на экран номер индекса с максимальным значением массива.
        System.out.println("Максимальный индекс массива: " + maxIndex);

        // Выводим на экран сумму всех значений массива.
        System.out.println("Сумма всех элементов массива: " + sum);

        // Создаём массив и вызываем метод для заполнения его индексами с максимальными значениями.
        int[] maxIndexArray = getMaxArrayIndex(array, maxNumber);

        // Вызываем метод для распечатки массива с индексами максимальных значений.
        System.out.print("Индексы повторяющихся максимальных элементов: ");
        printArray(maxIndexArray);
    }

    // Метод для заполнения массива рандомными значениями.
    public static int[] randomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    // Метод для поиска максимального значения в массиве.
    public static int getMaxValue(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    // Метод для поиска индекса массива с максимальным значением.
    public static int getMaxIndex(int[] array) {
        int max = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    // Метод для сложения всех значений нашего массива.
    public static int calcSumArray(int[] array) {
        int sum = 0;

        for (int n : array) {
            sum += n;
        }
        return sum;
    }
    // Метод для заполнения вспомогательного массива индексами с максимальным значениям.
    public static int[] getMaxArrayIndex(int[] array, int maxNumber) {
        int[] maxIndex = new int[array.length];
        int indexCount = 0;

        // Проходим по нашему массиву и сравниваем каждый элемент на максимальное значение.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNumber) {
                maxIndex[indexCount] = i;
                indexCount++;
            }
        }
        // Копируем элементы из одного массива в другой
        // Копирование элементов из одного массива в другой в данном случае используется для того,
        // чтобы создать новый массив, содержащий только индексы элементов, которые равны максимальному значению.
        // Таким образом, мы получаем новый массив, который содержит только информацию о позициях максимальных элементов в исходном массиве.
        // Это может быть полезно, например, для дальнейшей обработки этих индексов или для вывода информации пользователю.
        int[] result = new int[indexCount];
        System.arraycopy(maxIndex, 0, result, 0, indexCount);
        return result;
    }

    public static void printArray(int[] array){
        for (int n : array){
            System.out.print(n + " / ");
        }
    }
}