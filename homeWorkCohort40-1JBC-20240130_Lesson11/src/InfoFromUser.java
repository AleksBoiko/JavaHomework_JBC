import java.util.Scanner;

public class InfoFromUser {
    public int enterInteger (String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        int enterInteger = scanner.nextInt();
        return enterInteger;
    }
    public double enterDouble (String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        double enterDouble = scanner.nextDouble();
        return enterDouble;
    }
    public String enterText (String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        String enterText = scanner.nextLine();
        return enterText;
    }
}
