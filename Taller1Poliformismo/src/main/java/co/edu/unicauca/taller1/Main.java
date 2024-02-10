package co.edu.unicauca.taller1;

import java.util.List;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Figure fig1 = new Circle(1.0); //radio
        Figure fig2 = new Circle(2.3);
        Figure fig3 = new Circle(4.2);

        Figure fig4 = new Square(4.2); // Lado

        Figure fig5 = new Triangle(4.0,3.0); // Base y Altura


        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        figures.add(fig4);
        figures.add(fig5);

        for (Figure fig : figures) {
            System.out.println("Type: " + fig.getClass().getSimpleName());
            System.out.println("Perimeter: " + fig.calculatePerimeter());
            System.out.println("Area: " + fig.calculateArea());
            System.out.println("--------------");
        }

    }
}