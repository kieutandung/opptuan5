package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        double radius = circle.getRadius();
        double area = circle.getArea();
        System.out.println("radius: " + radius + "; area: " + area);
    }
}
