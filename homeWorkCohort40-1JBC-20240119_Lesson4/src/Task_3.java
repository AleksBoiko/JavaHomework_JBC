public class Task_3 {
    public static void main(String[] args) {
        int productA = 1000;
        int productB = 500;
        int discount = 100;

        int totalCoast = productA + productB;

        System.out.println("Total price of goods: " + totalCoast);
        System.out.println("Your purchase discount: " + discount);
        System.out.println("Your total amount payable: " + (totalCoast - discount));
    }
}
