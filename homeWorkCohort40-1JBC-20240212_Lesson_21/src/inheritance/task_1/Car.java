package inheritance.task_1;

public class Car extends Vehicles{
    private String color;
    private int numbersOfDoors;
    private int horsepower;
    private String maxSpeed;

    public Car(String brand, String model, String color, int numbersOfDoors, int horsepower, String maxSpeed) {
        super(brand, model);
        this.color = color;
        this.numbersOfDoors = numbersOfDoors;
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
    }

    public void move(){
        System.out.println("Driving the car.");
    }

    @Override
    public String toString() {
        return "Car: " + brand + "\n Model: " + model + "\nColor: " + color + "\nNumber of doors: " +
                numbersOfDoors + "\nHorsepower: " + horsepower + "\nMaximum speed: " + maxSpeed;

    }
}
