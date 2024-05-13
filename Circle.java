public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        double radius = circle.getRadius();
        double area = circle.getArea();
        System.out.println("radius: " + radius + "; area: " + area);
    }
}
