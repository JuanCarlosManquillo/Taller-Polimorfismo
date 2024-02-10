package co.edu.unicauca.taller1;

public class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(double base, double height ) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return base*height *0.5 ; // 0.5 = 1/2
    }

    @Override
    public double calculatePerimeter() {
       return base+base+base;
    }
}
