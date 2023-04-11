public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("iPhone", "12 Pro Max", 1199);
        Phone phone2 = new Phone("Samsung", "Galaxy S21 Ultra", 1199);
        Phone phone3 = new Phone("Google", "Pixel 6 Pro", 899);
        Phone phone4 = new Phone("OnePlus", "9 Pro", 969);
        Phone phone5 = new Phone("Xiaomi", "Mi 11 Ultra", 1199);

        System.out.println(phone1.getData());
        System.out.println(phone2.getData());
        System.out.println(phone3.getData());
        System.out.println(phone4.getData());
        System.out.println(phone5.getData());
    }
}