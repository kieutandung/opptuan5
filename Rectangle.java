public class Rectangle {
    private int length;
    private int width;
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,3);
        double perimeter = rectangle.getPerimeter();
        double area = rectangle.getArea();
        System.out.println("Perimeter:" + perimeter + " " + "area" + area);
    }
}
