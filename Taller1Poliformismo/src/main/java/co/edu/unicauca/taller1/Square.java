package co.edu.unicauca.taller1;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
