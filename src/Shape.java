


//     public interface Shape {
//         String color = "green";
//         boolean filled = true;
//         double getArea();
//         double getPerimeter();
//         ShapeProperties getProperties();
//     }
    
//     public interface ShapeProperties {
//         String getColor();
//         boolean isFilled();
//     }
    
//     public class DefaultShapeProperties implements ShapeProperties {
//         private String color;
//         private boolean filled;
    
//         public DefaultShapeProperties(String color, boolean filled) {
//             this.color = color;
//             this.filled = filled;
//         }
    
//         @Override
//         public String getColor() {
//             return color;
//         }
    
//         @Override
//         public boolean isFilled() {
//             return filled;
//         }

// }

public interface Shape {
    // Instance variables
    String color = "green";
    boolean filled = true; 

    // Abstract methods
    double getArea();
    double getPerimeter();

    // Getters
    String getColor();
    boolean isFilled();

}

