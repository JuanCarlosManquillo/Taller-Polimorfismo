package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    void testCreate(){
        Triangle triangle = new Triangle(4.0, 3.0);
        assertEquals(4.0, triangle.getBase());
        assertEquals(3.0, triangle.getHeight());
    }
    @Test
    void testCalculateArea() {
        Triangle triangle = new Triangle(4.0, 3.0);
        assertEquals(6.0, triangle.calculateArea());
    }
    @Test
    void testCalculatePerimeter(){
        Triangle triangle = new Triangle(4.0,3.0);
        assertEquals(12,triangle.calculatePerimeter());
    }
}
