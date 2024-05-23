package Phone;

public class Phone {
    private String name;
    private int number;
    private  double price;
    public Phone(){

    }
    public Phone(String name,double price,int number){
        this.name = name;
        this.number = number;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    @Override
    public String toString(){
        return "Phone [name=" + name + ", number=" + number + ", price=" + price + "]";
    }
}
