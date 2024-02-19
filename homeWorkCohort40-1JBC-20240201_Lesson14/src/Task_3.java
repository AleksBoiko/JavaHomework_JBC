import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {

        // Создаём массив на 15 элементов.
        int[] array = new int[15];

        // Заполняем наш массив случайными (рандомными) значениями.
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        // Проходим по нашему массиву для того, чтобы его распечатать.
        for (int n : array){
            // Распечатываем наш массив.
            System.out.print(n + " ");
        }
        // Проходим по нашему массиву для того, чтобы подсчитать количество чётных элементов.
        // Для этого мы создаём переменную в которую мы будем складывать чётные значения.
        // А также мы создаём условия при которых элемент со значением 0 считаться не будет.
        int evenElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                evenElements += 1;
            } else {
            }
        }
        System.out.println();
        System.out.println("-".repeat(46));
        System.out.println("Количество чётных элементов в нашем массиве: " + evenElements);

    }
}