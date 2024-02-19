public class Task_1_b {
    public static void main(String[] args) {

        // Создаём массив из чисел.
        int[] array2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        // Проходим по массиву циклом for для того, чтобы распечатать данный массив.
        System.out.println("Наш исходной массив: ");
        for (int i = 0; i < array2.length; i++) {
            // Распечатываем наш массив.
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println("-".repeat(39));
        // Количество элементов = 9.

        // Создаём переменную и присваиваем ей значение количества элементов массива и + 1.
        int quantityOfElementsArray2 = array2.length + 1;

        // Распечатываем количество элементов нашего массива + 1.
        System.out.println("Длина нашего массива + 1: = " + quantityOfElementsArray2);
        System.out.println("-".repeat(39));

        // Создаём переменную для суммы всех значений элементов массива и присваиваем ей значение 0.
        int sumOfElementsArray2 = 0;

        // Создаём промежуточную переменную и прописываем математическую формулу для поиска недостающего элемента.
        int temp = (quantityOfElementsArray2 * (quantityOfElementsArray2 + 1)) / 2;

        // Проходим по нашему массиву и суммируем все элементы.
        for (int i = 0; i < array2.length; i++) {
            sumOfElementsArray2 += array2[i];
        }
        // Создаём переменную и присваиваем ей поиск недостающего элемента путём вычитания int temp - int sumOfElementsArray2.
        int missingElement = temp - sumOfElementsArray2;

        // Распечатываем недостающий элемент нашего массива.
        System.out.println("Недостающий элемент нашего массива = " + missingElement);
    }
}