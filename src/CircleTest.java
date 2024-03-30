import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CircleTest {

    Circle circleClass= new Circle("red", true, "round", 2.0);
    @Test
    void testGetArea() {
        assertEquals(12.56, circleClass.getArea());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(12.56, circleClass.getPerimeter());
    }

    @Test
    void testGetRadius() {
        assertEquals(2.0, circleClass.getRadius());
    }

    @Test
    void testGetShape() {
        assertEquals("round", circleClass.getShape());
    }

    @Test
    void testIsCircle() {
        assertEquals(true, circleClass.isCircle());
    }

    @Test
    void testToString() {
//paste here
    }
}
