public class Rectangle  {

    //instance variables
    protected String shape;
    protected double angle;//90 degrees- each angle 
    protected double sum;//360 degrees- all angles sum
    protected double width;
    protected double length;
    protected double height;


    // Constructors that can take in various combinations of 
    //Rectangle's instance variables as parameter variables
    public Rectangle(String color, boolean filled, String shape, double angle, double sum, double length, double width) {
        
        this.shape = shape;
        this.angle = angle;
        this.sum = sum;
        this.length= length;
        this.width = width;
        
    }

    public Rectangle(double side, double side2, String string) {
    }

    //Getters for all the instance variables.
    public String getShape() {
        return shape;
    }

    public double getAngle() {
        return angle;
    }

    public double getSum() {
        return sum;
    }

    //methods
    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return width*2 + length*2;
    }

    public double getDiagonal(){
        return Math.sqrt((width*width) + (length*length));
    }

    //An isRectangle() method that returns true or false and uses the 
    //instance variables to determine if object would be a Rectangle

    public boolean isRectangle(){
        if (shape.equals("square")){
            return true;
        }
        return false;
    }

    //Override the toString() method to return "A Square with side=xxx, 
    //which is a subclass of yyy",
    // where yyy is the output of the toString() method from the superclass.
    @Override
    public String toString() {
        return "Rectangle [shape=" + shape + ", angle=" + angle 
        + "which is a subclass of Shape" + super.toString() + ", sum=" + sum +
        ", width=" + width + ", length="
        + length + ", height=" + height +"]";
    }

    //Figure out if there is a need to override the getArea(), getPerimeter(), and getDiagonal()

    
}
