package treeSetFlat;

public class Flat {
    private double area;
    private int bedrooms;

    public Flat(double area, int bedrooms) {
        this.area = area;
        this.bedrooms = bedrooms;
    }

    public double getArea() {
        return area;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public String toString() {
        return "Квартира: = площадь = " + area + " количество спален: = " + bedrooms;
    }
}
