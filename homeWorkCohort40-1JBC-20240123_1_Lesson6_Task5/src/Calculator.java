import java.util.Scanner;

public class Calculator {
    public int getNumber (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your desired number, please ");
        return scanner.nextInt();
    }
    public int addition (int number1, int number2){
        return number1 + number2;
    }
    public int subtraction (int number1, int number2) {
        return number1 - number2;
    }
    public int multiplication (int number1, int number2) {
        return number1 * number2;
    }
    public int division (int number1, int number2) {
        return number1 / number2;
    }
}
