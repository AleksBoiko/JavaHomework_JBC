import java.util.Scanner;

public class Task_8_a {
    public static void main(String[] args) {
        // Создаём scanner и запрашиваем у пользователя строку.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую строку:");

        // Создаём переменную и сохраняем пользовательскую строку.
        String str = scanner.nextLine();

        // Выводим на экран пользовательскую строку.
        System.out.println("Вы ввели: " + str);
        System.out.println("-".repeat(80));

        // Проверяем то, что нам вернул метод о строке пользователя true или false.
        if (isPalindromeString(str)) {
            // Если метод вернул true, выводим на экран эту часть кода.
            System.out.println("Строка введённая Вами является палиндромом ");

            // Если метод вернул false, выводим на экран эту часть кода.
        } else {
            System.err.println("Строка введённая Вами не является палиндромом ");
        }
    }

    public static boolean isPalindromeString(String str) {
        // Функция replaceAll("\\s+", "") используется для замены всех пробелов в строке на пустую строку.
        // Функция replaceAll("\\p{Punct}", "") используется для удаления всех знаков пунктуации из строки.
        // Преобразование строки в нижний регистр.
        String result = str.replaceAll("\\s", "").replaceAll("\\p{Punct}", "").toLowerCase();

        // Проверяем нашу строку.
        int l = 0;
        int r = result.length() - 1;
        while (l < r){
            if (result.charAt(l) != result.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}