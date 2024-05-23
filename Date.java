public class Date {
    int day;
    int month;
    int year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDay() {
        this.day = day;
    }
    public void setMonth() {
        this.month = month;
    }
    public void setYear() {
        this.year = year;
    }

    public static void main(String[] args) {
        Date date = new Date(13,12,2005);
        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();
        System.out.println(day + "/" + month + "/" + year);
    }
}