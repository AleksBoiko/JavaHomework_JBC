public class Task_6 {
    public static void main(String[] args) {

        // Создаём массив со словами.
        String[] nameOfCars = {"Audi", "Bentley", "Bmw", "Bugatti", "Chrysler", "Ferrari", "Ford", "Maserati", "Mitsubishi"};

        // Считаем количество слов с чётным значением букв.
        // Создаём переменную для подсчета и присваиваем ей значение 0.
        int evenNumbers = 0;
        for (String word : nameOfCars){
            if (word.length() % 2 == 0){
                evenNumbers++;
            }
        }

        // Создаём массив из слов с чётным количеством букв.
        String[] evenNumbersArray = new String[evenNumbers];
        // Создаём переменную для подсчета и присваиваем ей значение 0.
        int evenWord = 0;
        for (String word : nameOfCars){
            if (word.length() % 2 == 0){
                evenNumbersArray[evenWord] = word;
                evenWord++;
            }
        }

        // Считаем количество слов с нечётным значением букв.
        // Создаём переменную для подсчета и присваиваем ей значение 0.
        int oddNumbers = 0;
        for (String word : nameOfCars){
            if (word.length() % 2 != 0){
                oddNumbers++;
            }
        }

        // Создаём массив из слов с нечётным количеством букв.
        String[] oddNumbersArray = new String[oddNumbers];
        // Создаём переменную для подсчета и присваиваем ей значение 0.
        int oddWord = 0;
        for (String word : nameOfCars){
            if (word.length() % 2 != 0){
                oddNumbersArray[oddWord] = word;
                oddWord++;
            }
        }

        // Перебираем массив из слов с чётным значением для того, чтобы распечатать.
        for (String evenOfWord : evenNumbersArray){
            // Распечатываем массив.
            System.out.print(evenOfWord + " / ");
        }
        System.out.println();
        System.out.println("-".repeat(48));

        // Перебираем массив из слов с нечётным значением для того, чтобы распечатать.
        for (String oddOfWord : oddNumbersArray){
            // Распечатываем массив.
            System.out.print(oddOfWord + " / ");
        }
        System.out.println();
        System.out.println("-".repeat(35));
    }
}