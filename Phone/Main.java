package Phone;

public class Main {
    public static void main(String[] args) {
        Phone iphone15 = new Phone("iphone 15", 15.55, 5);
        Phone redmi15 = new Phone("redmi15", 13.43, 12);
        Phone realmi5 = new Phone("realmi5", 12.21, 55);
        Phone iphone14 = new Phone("iphone 14", 15.55, 5);
        ManagerPhone managerPhone = new ManagerPhone();
        managerPhone.addPhone(iphone15);
        managerPhone.addPhone(redmi15);
        managerPhone.addPhone(realmi5);
        managerPhone.addPhone(iphone14);
//        managerPhone.displayListPhone();
//        System.out.println(managerPhone.findPricePhoneWithPhoneName("iphone 15"));
//        managerPhone.remotePhoneWithPhoneName("iphone 15");
//        managerPhone.displayListPhone();
//        if (managerPhone.remotePhoneWithPhoneName("iphone 15")){
//            System.out.println("da xoa");
//            System.out.println("danh sach hien tai");
        managerPhone.sortPhoneWithPrice(true);
        managerPhone.displayListPhone();
//        System.out.println("tong: " + managerPhone.calculateTotalPrice());
//        }
    }
}