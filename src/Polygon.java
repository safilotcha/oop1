public abstract class Polygon implements Shape {
    protected String color;
    protected boolean filled;

    public Polygon(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }
}
