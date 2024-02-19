public class Task_4 {
    public static void main(String[] args) {

        InfoFromUser infoFromUser = new InfoFromUser();
        int size = infoFromUser.enterInteger("Enter the size of the multiplication table:");

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }
    }
}
