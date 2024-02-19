import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите желаемое слово №1");
        String firstWord = scanner.nextLine();

        System.out.println("Введите желаемое слово №2");
        String secondWord = scanner.nextLine();

        String combiWord = operationWithWord(firstWord, secondWord);
        System.out.println("Комбинированное слово: " + combiWord);
    }
    public static String operationWithWord (String firstWord, String secondWord){
        int firstWordHalfLength = firstWord.length() / 2;
        int secondWordHalfLength = secondWord.length() / 2;

        String firstHalfWord = firstWord.substring(0, firstWordHalfLength);
        String secondHalfWord = secondWord.substring(secondWordHalfLength);

        return firstHalfWord + secondHalfWord;
    }
}
