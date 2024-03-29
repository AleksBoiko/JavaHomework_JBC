package inheritance.task_2;

public class Square extends Shape {
    private double side;

    public Square(double size) {
        this.side = size;
    }

    @Override
    public double calculateArea(){
        return side * side;
    }
    @Override
    public double calculatePerimeter(){
        return side * 4;
    }
    @Override
    public String toString() {
        return "Area is: " + calculateArea() + "\nPerimeter is: " + calculatePerimeter();
    }

}
