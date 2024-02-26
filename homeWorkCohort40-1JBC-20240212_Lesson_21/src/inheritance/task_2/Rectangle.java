package inheritance.task_2;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
    public double calculatePerimeter(){
        return (width + height) * 2;
    }
    @Override
    public String toString() {
        return "Area is: " + calculateArea() + "\nPerimeter is: " + calculatePerimeter();
    }
}
