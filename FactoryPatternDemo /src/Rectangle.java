public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 2;
        this.width = 1.5;
    }

    @Override
    public double getArea() {
        return length * width;
    }

}
