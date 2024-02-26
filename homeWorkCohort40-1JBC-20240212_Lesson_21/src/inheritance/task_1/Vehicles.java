package inheritance.task_1;

public class Vehicles {
    protected String brand;
    protected String model;

    public Vehicles(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void move (){
        System.out.println("Moving...");
    }
    public static void printVehicleInfo (Car car){
        System.out.println(car);
    }
    public static void printVehicleInfo (Motorcycle motorcycle){
        System.out.println(motorcycle);
    }
    public static void printVehicleInfo (Bicycle bicycle) {
        System.out.println(bicycle);
    }
}
