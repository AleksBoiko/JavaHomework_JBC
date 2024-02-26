package inheritance.task_2;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * ( halfPerimeter - sideC));
        return area;
    }
    public double calculatePerimeter(){
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Area is: " + calculateArea() + "\nPerimeter is: " + calculatePerimeter();
    }
}
