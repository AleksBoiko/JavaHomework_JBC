package inheritance.task_1;

import java.util.List;

public class Motorcycle extends Vehicles{
    private String type;
    private int seatCapacity;
    private int horsepower;
    private String maxSpeed;

    public Motorcycle(String brand, String model, String type, int seatCapacity, int horsepower, String maxSpeed) {
        super(brand, model);
        this.type = type;
        this.seatCapacity = seatCapacity;
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle: " + brand + "\n Model: " + model + "\nType: " + type + "\nSeat Capacity: "
                + seatCapacity + "\nHorsepower: " + horsepower + "\nMaximum speed: " + maxSpeed;

    }
}
