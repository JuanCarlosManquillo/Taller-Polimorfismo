package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testCreate(){
        Square square = new Square(3.0);
        assertEquals(3.0,square.getSide());
    }
    @Test
    void testCalculateArea(){
        Square square = new Square(3.0);
        assertEquals(9.0,square.calculateArea());
    }
    @Test
    void testCalculatePerimeter(){
        Square square = new Square(3.0);
        assertEquals(12.0, square.calculatePerimeter());
    }


}
