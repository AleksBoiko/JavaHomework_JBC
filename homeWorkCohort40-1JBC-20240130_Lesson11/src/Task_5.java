public class Task_5 {
    public static void main(String[] args) {
        InfoFromUser infoFromUser = new InfoFromUser();
        int n = infoFromUser.enterInteger("Enter desired number please");
        if (n <= 0){
            System.out.println("You entered not correct number");
        } else {

        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The quantity of even numbers is: " + evenCount);
        System.out.println("The quantity of odd numbers is: " + oddCount);
    }
}
