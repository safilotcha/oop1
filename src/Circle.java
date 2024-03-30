public class Circle extends Shape{

    //Instance variables associated with a Circle
    protected String shape;
    protected double radius;
    protected static final double PI= 3.14;


     //Constructors that can take in various combinations of Circle's instance variables as parameter variables
    public Circle(String color, boolean filled, String shape, double radius) {
        super(color, filled);
        this.shape = shape;
        this.radius = radius;

    }

    //Getters for all instance variables.

    public String getShape() {
        return shape;
    }

    public double getRadius() {
        return radius;
    }
//  Methods getArea() and getPerimeter().
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2 * PI *radius;
    }

    //An isCircle() method that returns true or false and uses the 
    //instance variables to determine if object would be a Circle
    public boolean isCircle(){
        if (shape.equals("round")) {
            return true;
        }
        return false;
    }

    //Override the toString() method inherited, to return "A Circle with
//radius=xxx, which is a subclass of yyy", where yyy is the output of the toString()
// method from the superclass.
@Override
    public String toString() {
        return "Circle [shape=" + shape + ", radius=" + radius + "which is a subclass of Shape" + super.toString() +"]";
    }


}
