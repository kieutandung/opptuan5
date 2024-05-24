package QuadraticEquation;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,2,3);
        double delta = quadraticEquation.getDiscriminant();
        if (delta >= 0 ){
            System.out.println("phương trình có 2 nghiệm:");
            System.out.println("Nghiệm 1: " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm 2: " + quadraticEquation.getRoot2());
        }
        else{
            System.out.println("phương trình không có nghiệm");
        }
    }
}
