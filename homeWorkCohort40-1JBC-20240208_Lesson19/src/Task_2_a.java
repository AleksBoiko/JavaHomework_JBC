import java.util.Scanner;

public class Task_2_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста строку:");
        String userStr = scanner.nextLine();

        // Создаём переменную для хранения количества слов.
        int word = 0;
         // Создаём переменную для указания, является ли данный символ частью текущего слова. Присваиваем false.
        boolean isWord = false;

        // Пробегаем по каждому символу в строке.
        for (int i = 0; i < userStr.length() - 1; i++) {
            // Создали переменную куда кладём каждый символ из строки.
            char c = userStr.charAt(i);
            // Проверяем каждый символ из строки является ли он буквой.
            // Если символ является буквой и не принадлежит к предыдущему слову, то счётчик увеличивается на 1
            if (Character.isLetter(c) && !isWord){
                word++;
                isWord = true;
                // Если символ не является буквой, то переменная приобретает значение false,
                // чтобы считать слово после встречи со следующей буквой.
            } else if (!Character.isLetter(c)) {
                isWord = false;
            }
        }
        System.out.println("Вы ввели: " + userStr);
        System.out.println("Количество слов: " + word);














    }
}
