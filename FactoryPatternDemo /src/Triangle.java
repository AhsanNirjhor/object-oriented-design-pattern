public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        this.sideA = 3;
        this.sideB = 4;
        this.sideC = 5;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;

        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

}
