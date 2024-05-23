package Temperature;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(10);
        System.out.println(temperature.getDoC());
        System.out.println(temperature.CtoF());
        System.out.println(temperature.CtoK());
    }
}
