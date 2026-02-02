public class Circle implements Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
