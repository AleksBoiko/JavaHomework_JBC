public class Task_1_a {
    public static void main(String[] args) {

        // Создаём массив из чисел.
        int[] array1 = {1,2,3,4,5,7,8,9};

        // Проходим по массиву циклом for-each для того, чтобы распечатать данный массив.
        System.out.println("Наш исходной массив: ");
        for (int arr : array1){
            // Распечатываем наш массив.
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.println("-".repeat(39));
        // Количество элементов = 8.

        // Создаём переменную и присваиваем ей значение количества элементов массива и + 1.
        int quantityOfElementsArray1 = array1.length + 1;

        // Выводим на экран количество элементов массива + 1.
        System.out.println("Длина нашего массива + 1: = " + quantityOfElementsArray1);
        System.out.println("-".repeat(39));

        // Создаём переменную для суммы всех значений элементов массива и присваиваем ей значение 0.
        int sumOfElementsArray1 = 0;

        // Создаём промежуточную переменную и прописываем математическую формулу для поиска недостающего элемента.
        int temp = (quantityOfElementsArray1 * (quantityOfElementsArray1 + 1)) / 2;

        // Проходим по нашему массиву и суммируем все элементы.
        for (int i = 0; i < array1.length; i++) {
            sumOfElementsArray1 += array1[i];
        }
        // Создаём переменную и присваиваем ей поиск недостающего элемента путём вычитания int temp - int sumOfElementsArray1.
        int missingElement = temp - sumOfElementsArray1;

        // Распечатываем недостающий элемент нашего массива.
        System.out.println("Недостающий элемент нашего массива = " + missingElement);
    }
}
