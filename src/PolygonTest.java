import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PolygonTest {
    Polygon polygon = new Polygon("blue", false) {

        @Override
        public double getArea() {
            throw new UnsupportedOperationException("Unimplemented method 'getArea'");
        }

        @Override
        public double getPerimeter() {
            throw new UnsupportedOperationException("Unimplemented method 'getPerimeter'");
        }
    
};
    @Test
    void testGetColor() {
    assertEquals("blue", polygon.color);
    }

    @Test
    void testIsFilled() {
        assertEquals(false, polygon.isFilled());
    }
}
