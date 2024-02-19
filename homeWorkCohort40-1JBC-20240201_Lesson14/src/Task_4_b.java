public class Task_4_b {
    public static void main(String[] args) {

        // Создаём массив из строк.
        String[] daysOfWeek = new String[7];

        // Присваиваем каждому элементу своё значение.
        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";

        // Перебираем наш массив для того, чтобы его распечатать.
        String str = "";
        for (int i = 0; i < daysOfWeek.length; i++) {
            str = daysOfWeek[i];
            System.out.print(str + " / ");
        }
        System.out.println();
        System.out.println("-".repeat(70));
        System.out.println("The last element in our array is: " + str + ".");
        System.out.println("-".repeat(41));
    }
}