public class Task_1 {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H"};
        System.out.println("Исходной массив:");
        printArray(array);
        printArray(reverseArray(array));

    }

    public static String[] reverseArray(String[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

    public static void printArray(String[] array) {
        for (String e : array) {
            System.out.print(e + " / ");
        }
        System.out.println();
        System.out.println("-".repeat(32));
    }
}

