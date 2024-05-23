package Temperature;

public class Temperature {
    private double doC;
    public Temperature (double getDoC){
        this.doC = getDoC;
    }
    public double getDoC(){
        return doC;
    }
    public double CtoF(){
        return (9/5 * doC)+ 32;
    }
    public double CtoK(){
        return (doC + 273.15);
    }
}
