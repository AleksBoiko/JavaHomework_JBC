
public class Task_1 {
    public static void main(String[]args) {
        InfoFromUser infoFromUser = new InfoFromUser();
        int n = infoFromUser.enterInteger("Enter desired number please ");

        int evenSum = 0;
        for (int i = 0; i <= n; i += 2) {
            evenSum += i;
        }
        System.out.println("The sum all even numbers from 0 to " + n + " = " + evenSum);
    }
}