package inheritance.task_1;

public class Bicycle extends Vehicles{
    private int numberOfGears;

    public Bicycle(String brand, String model, int numberOfGears) {
        super(brand, model);
        this.numberOfGears = numberOfGears;
    }

    @Override
    public String toString() {
        return "Bicycle: " + brand + "\nModel: " + model + "\nNumber of gears: " + numberOfGears;

    }
}
