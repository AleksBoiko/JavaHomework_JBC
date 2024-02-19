public class Task_2 {
    public static void main(String[] args) {
        InfoFromUser infoFromUser = new InfoFromUser();
        int n = infoFromUser.enterInteger("Enter desired number please ");

        if (isPrimeNumber(n)){
            System.out.println("You entered " + n + " and it's a prime number");
        } else {
            System.out.println("You entered " + n + " and it's composite number!");
        }
    }
    public static boolean isPrimeNumber (int n){
        if (n <= 1){
            return false;
        } else if (n == 2 || n == 3){
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
