public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome everyone ");
        Calculator calculator = new Calculator();
        int number1 = calculator.getNumber();
        int number2 = calculator.getNumber();

        int add = calculator.addition(number1, number2);
        int subt = calculator.subtraction(number1, number2);
        int mult = calculator.multiplication(number1, number2);
        double div = calculator.division(number1, number2);

        System.out.println(add);
        System.out.println(subt);
        System.out.println(mult);
        System.out.println(div);
    }
}