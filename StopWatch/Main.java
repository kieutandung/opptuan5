package StopWatch;
public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        for (int i = 0 ; i < 100;i++){
            System.out.println("");
        }
        stopWatch.stop();
        System.out.println("Thời gian thực thi: " + stopWatch.getElapsedTime() + "ms");
    }
}