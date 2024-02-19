public class Task_3 {
    public static void main(String[] args) {
        int number = 369;
        int in1 = number / 123;
        int in2 = number / 123 + in1;
        int in3 = in1 + in2;

        System.out.println("Исходное число: " + number);
        System.out.println("Это же составное число: " + in1 + "," + in2 + "," + in3);
        System.out.println("-".repeat(30));
    }
}
