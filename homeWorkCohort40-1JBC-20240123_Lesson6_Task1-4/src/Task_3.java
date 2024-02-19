public class Task_3 {
    public static void main(String[] args) {
        float pizza1 = 24;
        float pizza2 = 28;
        int caloriesPerCm = 40;

        double caloriesPizza1 = ((pizza1 * pizza1 / 4) * Math.PI) * caloriesPerCm;
        double caloriesPizza2 = ((pizza2 * pizza2 / 4) * Math.PI) * caloriesPerCm;
        double difference = caloriesPizza2 - caloriesPizza1;
        System.out.println(difference);
    }
}
