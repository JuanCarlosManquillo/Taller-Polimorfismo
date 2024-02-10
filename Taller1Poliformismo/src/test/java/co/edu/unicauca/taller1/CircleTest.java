package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testCreate(){
        Circle circle = new Circle(2.0);
        assertEquals(2.0, circle.getRadius());
    }

    @Test
    void testCalculatePerimeter(){
        Circle circle = new Circle(2.0);
        assertEquals(2.0*Math.PI*2.0, circle.calculatePerimeter());
    }
    @Test
    void testCalculateArea(){
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI * Math.pow(2.0,2),circle.calculateArea());

    }

}