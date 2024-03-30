public abstract class Equilateral implements Shape {
    public static Object getColor;
    public static Object isFilled;
    protected double side;
    protected String color;
    protected boolean filled;

    public Equilateral(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String getColor() {
        return "purple";
    }

    @Override
    public boolean isFilled() {
        return true;
    }
}