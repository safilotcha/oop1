import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class RectangleTest {
    Rectangle rectangleClass = new Rectangle("blue", false, "square", 90.0, 360.0, 10.0, 5.0);
    @Test
    void testGetAngle() {
    assertEquals(90.0, rectangleClass.getAngle());
    }

    @Test
    void testGetArea() {
        assertEquals(50.0, rectangleClass.getArea());
    }

    @Test
    void testGetDiagonal() {
    assertEquals(11.180339887498949, rectangleClass.getDiagonal());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(30, rectangleClass.getPerimeter());
    }

    @Test
    void testGetShape() {
        assertEquals("square", rectangleClass.getShape());
    }

    @Test
    void testGetSum() {
        assertEquals(360, rectangleClass.getSum());
    }

    @Test
    void testIsRectangle() {
        assertEquals(true, rectangleClass.isRectangle());
    }

    @Test
    void testToString() {
        //paste toString
    }
}
