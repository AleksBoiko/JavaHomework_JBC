public class Task_3 {
    public static void main(String[] args) {
        int sum = 0;
        InfoFromUser infoFromUser = new InfoFromUser();
        while (true){
            System.out.println("Enter desired number please:");
            int n = infoFromUser.enterInteger("Enter a negative number or zero to complete:");
            if (n <= 0) {
                break;
            }
            sum += n;
        }
        System.out.println("Sum of all numbers: = " + sum);
    }
}
