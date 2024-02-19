import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        int number = scanner.nextInt();
        int factorialNumber = factorial(number);
        System.out.println(factorialNumber);
    }
    public static int factorial (int number){
        if (number < 0){
            System.out.println("Число не может быть отрицательным или равным 0!");
        }
        int res = 1;
        for (int i = 1; i <= number; i++){
            res = res * i;
        }
         return res;
    }
}