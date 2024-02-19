public class Task_4_a {
    public static void main(String[] args) {
        // Создаём массив с количеством элементов 7 и присваиваем каждому элементу своё значение.
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Проходим по массиву для того, чтобы его распечатать
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.print(daysOfWeek[i] + " / ");
        }
        System.out.println();
        System.out.println("-".repeat(70));

        // Распечатываем значение последнего элемента нашего массива.
        System.out.println("The last element in our array is: " + daysOfWeek[daysOfWeek.length - 1]);
        System.out.println("-".repeat(40));
    }
}