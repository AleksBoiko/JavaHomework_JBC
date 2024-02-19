public class Task_2 {
    public static void main(String[] args) {
        short sh1 = 0;
        short sh2 = 1;
        short sh3 = 2;
        short sh4 = 3;
        short sh5 = 4;
        short sh6 = 5;
        short sh7 = 6;
        short sh8 = 7;
        short sh9 = 8;
        short sh10 = 9;

        double sum = sh1 + sh2 + sh3 + sh4 + sh5 + sh6 + sh7 + sh8 + sh9 + sh10;
        double average = sum / 10;
        double decimals = sum % 10;

        System.out.println("Average: " + average);
        System.out.println("Decimals: " + decimals);
    }
}
