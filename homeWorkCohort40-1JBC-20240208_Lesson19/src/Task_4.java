import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];

        for (int i = 0; i < 5; i++) {
            arrayOne[i] = random.nextInt(6);
            arrayTwo[i] = random.nextInt(6);
        }

        System.out.println("Массив № 1:");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + " / ");
        }
        System.out.println();
        System.out.println("Массив № 2:");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + " / ");
        }
        System.out.println();
        System.out.println("-".repeat(20));

        double resultArrayOne = sumArray(arrayOne);
        double resultArrayTwo = sumArray(arrayTwo);

        if (resultArrayOne > resultArrayTwo){
            System.out.println("У массива № 1 среднее арифметическое является больше, чем у массива № 2 = " + resultArrayOne + " > " + resultArrayTwo);
        } else if (resultArrayTwo > resultArrayOne) {
            System.out.println("У массива № 2 среднее арифметическое является больше, чем у массива № 1 = " + resultArrayTwo + " > " + resultArrayOne);
        } else {
            System.out.println("Массивы равны " + resultArrayOne + " = " + resultArrayTwo);
        }
    }
    public static double sumArray(int[] array){
        double sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        return sumArray / array.length;
    }
}
