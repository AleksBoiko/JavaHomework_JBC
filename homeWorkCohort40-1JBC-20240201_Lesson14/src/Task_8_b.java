import java.util.Scanner;

public class Task_8_b {
    public static void main(String[] args) {
        // Создаём scanner и запрашиваем у пользователя строку.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую строку");

        // Создаём переменную и сохраняем пользовательскую строку.
        String str = scanner.nextLine();

        // Выводим на экран пользовательскую строку.
        System.out.println("Вы ввели: " + str);
        System.out.println("-".repeat(80));

        // Проверяем то, что нам вернул метод о строке пользователя true или false.
        if (isStringPalindrome(str)) {
            // Если метод вернул true, выводим на экран эту часть кода.
            System.out.println("Строка введённая Вами является палиндромом ");

            // Если метод вернул false, выводим на экран эту часть кода.
        } else {
            System.err.println("Строка введённая Вами не является палиндромом ");
        }
    }

    // Метод проверки строки.
    public static boolean isStringPalindrome(String str) {

        // Функция replaceAll("\\s+", "") используется для замены всех пробелов в строке на пустую строку.
        // Выражение "\\s+" означает один или более пробельных символов.
        // При использовании этой функции, все пробелы будут удалены из строки.
        String first = str.replaceAll("\\s+", "");

        // Функция replaceAll("\\p{Punct}", "") используется для удаления всех знаков пунктуации из строки.
        // Выражение "\\p{Punct}" соответствует любому знаку пунктуации.
        // При использовании этой функции, все знаки пунктуации будут удалены из строки.
        String second = first.replaceAll("\\p{Punct}", "");

        // Преобразование строки в нижний регистр.
        String result = second.toLowerCase();

        // Проверка строки, является ли строка палиндромом.
        // Проверка происходит сравнением от начала и до середины, с концом и до середины
        for (int i = 0; i < result.length() / 2; i++) {
            if (result.charAt(i) != result.charAt(result.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}