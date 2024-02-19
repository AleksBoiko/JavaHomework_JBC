import java.util.Scanner;

public class RemoveSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите какой-нибудь текст:");
        String str = scanner.nextLine();

        System.out.println("The original string: " + str);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch != '(' && ch != ')' && ch != '@' && ch != '&' && ch != '#'){
                stringBuilder.append(ch);
            }
        }
        String cleanStr = stringBuilder.toString();
        System.out.println("The cleaned string: " + cleanStr);
    }
}
