package inheritance.task_2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter(){
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Area is: " + calculateArea() + "\nPerimeter is: " + calculatePerimeter();
    }
}
