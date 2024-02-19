import java.util.Random;

public class MyArrayCheckSequence {
    public static void main(String[] args) {
        // Создаём массив на 5 элементов
        int[] myArray = new int[5];
        Random random = new Random();
        // Заполняем массив случайными числами от 10 до 99
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(90) + 10;
       }
        // Перебираем массив, чтобы вывести на экран
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        // Определите и выведите на экран сообщение о том,
        // является ли массив строго возрастающей последовательностью.
        boolean isSequence = true;
        for (int i = 0; i < myArray.length - 1 ; i++) {
            if (myArray[i] > myArray[i + 1]){
                isSequence = false;
            }
        }
        if (isSequence){
            System.out.println("This array with increasing sequence");
        } else {
            System.out.println("This array with a non-increasing sequence");
        }
    }
}
