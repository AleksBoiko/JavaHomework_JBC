public class Task_5 {
    public static void main(String[] args) {
        int number1 = 10;
        int remainder1 = number1 % 2;
        // remainder1 = 0, т.к. 10 делится нацело на 2
        System.out.println(remainder1);

        int number2 = 13;
        int remainder2 = number2 % 2;
        // remainder2 = 1, т.к. 13 не делится нацело на 2
        System.out.println(remainder2);

        int number3 = 12;
        int remainder3 = number3 % 3;
        // remainder3 = 0, т.к. 12 делится нацело на 3
        System.out.println(remainder3);

        int number4 = 15;
        int remainder4 = number4 % 3;
        // remainder4 = 0, т.к. 15 делится нацело на 3
        System.out.println(remainder4);

        int number5 = 17;
        int remainder5 = number5 % 3;
        // remainder5 = 2, т.к. 17 не делится нацело на 3
        System.out.println(remainder5);
    }
}
