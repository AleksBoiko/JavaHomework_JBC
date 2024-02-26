package inheritance.task_1;

import java.util.ArrayList;
import java.util.List;

import static inheritance.task_1.Vehicles.printVehicleInfo;

public class DemoVehicle {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X3", "Atlantic blue", 5, 252, "250 km/h");
        Car car2 = new Car("Ford", "Kuga", "Black", 5, 150, "190 km/h");
        Car car3 = new Car("Bentley", "Flying Spur", "White", 4, 550, "318 km/h");

        Motorcycle motorcycle1 = new Motorcycle("BMW", "R1250GSA", "Adventure", 2, 136, "over 200 km/h");
        Motorcycle motorcycle2 = new Motorcycle("BMW", "K1600GTL", "Sport Tourist", 2, 160, "over 200 km/h");
        Motorcycle motorcycle3 = new Motorcycle("Trumph", "Tiger1200", "Adventure", 2, 150, "over 200 km/h");

        Bicycle bicycle1 = new Bicycle("Giant", "Espace", 21);
        Bicycle bicycle2 = new Bicycle("Merida", "Ninety", 18);
        Bicycle bicycle3 = new Bicycle("Ghost", "Nirvana", 21);

        printVehicleInfo(car1);
        System.out.println("-".repeat(25));
        printVehicleInfo(car2);
        System.out.println("-".repeat(25));
        printVehicleInfo(car3);
        System.out.println("=".repeat(25));

        printVehicleInfo(motorcycle1);
        System.out.println("-".repeat(25));
        printVehicleInfo(motorcycle2);
        System.out.println("-".repeat(25));
        printVehicleInfo(motorcycle3);
        System.out.println("=".repeat(25));

        printVehicleInfo(bicycle1);
        System.out.println("-".repeat(25));
        printVehicleInfo(bicycle2);
        System.out.println("-".repeat(25));
        printVehicleInfo(bicycle3);
        System.out.println("=".repeat(25));

    }

}
