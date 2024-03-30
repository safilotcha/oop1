import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    Square squareClass = new Square(5, 5, "green");

   

    @Test
    void testGetArea() { 
        assertEquals(0.0, squareClass.getArea());

    }

    @Test
    void testGetDiagonal() {
    assertEquals(0.0, squareClass.getDiagonal());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(0.0, squareClass.getPerimeter());
    }

    @Test
    void testIsFilled() {
        // assertEquals(true, squareClass.isFilled());
    }

   


    @Test
    void testToString() {
        //toString
    }


}
