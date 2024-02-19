public class Task_2 {
    public static void main(String[] args) {

        // Создаём массив из чисел от 1 до 99.
        int[] array = new int[99];

        // Заполняем массив значениями от 1 до 99.
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Распечатка нашего массива в порядке возрастания:");
        // Распечатываем наш массив в порядке возрастания.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-".repeat(288));
        System.out.println("Распечатка нашего массива в порядке убывания:");
        // Распечатываем наш массив в порядке убывания.
        for (int i = 98; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-".repeat(288));
    }
}