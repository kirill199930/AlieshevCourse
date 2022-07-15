package day9.Task2;

public class Circle extends Figure {
    private double round;

    public Circle(double round, String color) {
        super(color);
        this.round = round;
    }

    @Override
    public double area() {
        return round * round * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * round;
    }
}
