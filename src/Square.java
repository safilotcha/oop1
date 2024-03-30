



public class Square extends Rectangle{
 
    public Square(double side, int i, String string) {
        super(side, side, "green"); // Sets side length, width, and color
    }


    private Object getWidth() {
        throw new UnsupportedOperationException("Unimplemented method 'getWidth'");
    }
    private Object getLength() {
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }
//Square has no instance variable, but inherits the instance variables from its superclass Rectangle.

    //An isSquare() method that returns true or false and uses the instance variables 
    //to determine if object would be a Square
    
    public boolean isSquare() {
        return getWidth() == getLength();
    }


    //Override the toString() method to return "A Square with side=xxx, which is a subclass of yyy", where yyy is the output of the 
    //toString() method from the superclass.
    @Override
    public String toString() {
        // Customized string representation for Square
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }


    @Override
    public double getAngle() {
        return super.getAngle();
    }

    @Override
    public double getArea() {

        return super.getArea();
    }

    @Override
    public double getDiagonal() {
        return super.getDiagonal();
    }

    @Override
    public double getPerimeter() {  
        return super.getPerimeter();
    }

    @Override
    public String getShape() {

        return super.getShape();
    }

    @Override
    public double getSum() {
        return super.getSum();
    }

    @Override
    public boolean isRectangle() {
        return super.isRectangle();
    }

    // @Override
    // public String getColor() {
    //     return super.getColor();
    // }

    // @Override
    // public boolean isFilled() {
    //     return super.isFilled();
    // }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



    
}
