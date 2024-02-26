package inheritance.task_2;

public class DemoShapes {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(20);

        Triangle triangle1 = new Triangle(15, 20, 30);
        Triangle triangle2 = new Triangle(25, 30, 40);
        Triangle triangle3 = new Triangle(35, 40, 50);

        Square square1 = new Square(15);
        Square square2 = new Square(20);
        Square square3 = new Square(30);

        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(15, 25);
        Rectangle rectangle3 = new Rectangle(20, 30);

        System.out.println("Triangle №1: " + "\n" + triangle1);
        System.out.println("-".repeat(35));
        System.out.println("Triangle №2: " + "\n" + triangle2);
        System.out.println("-".repeat(35));
        System.out.println("Triangle №3: " + "\n" + triangle3);
        System.out.println("=".repeat(35));

        System.out.println("Square №1: " + "\n" + square1);
        System.out.println("-".repeat(35));
        System.out.println("Square №2: " + "\n" + square2);
        System.out.println("-".repeat(35));
        System.out.println("Square №3: " + "\n" + square3);
        System.out.println("=".repeat(35));

        System.out.println("Circle №1: " + "\n" + circle1);
        System.out.println("-".repeat(35));
        System.out.println("Circle №2: " + "\n" + circle2);
        System.out.println("-".repeat(35));
        System.out.println("Circle №3: " + "\n" + circle3);
        System.out.println("=".repeat(35));

        System.out.println("Rectangle №1: " + "\n" + rectangle1);
        System.out.println("-".repeat(35));
        System.out.println("Rectangle №2: " + "\n" + rectangle2);
        System.out.println("-".repeat(35));
        System.out.println("Rectangle №3: " + "\n" + rectangle3);
        System.out.println("=".repeat(35));

    }
}
