public class Main {
    public static void main(String[] args) {

        Phone[] phones = new Phone[10];
        phones[0] = new Phone("Samsung", "Galaxy S21", 1000, 256);
        phones[1] = new Phone("Apple", "iPhone 12 Pro", 1200, 512);
        phones[2] = new Phone("Xiaomi", "Mi 11 Ultra", 900, 256);
        phones[3] = new Phone("OnePlus", "9 Pro", 950, 128);
        phones[4] = new Phone("Google", "Pixel 6 Pro", 1100, 128);
        phones[5] = new Phone("LG", "Wing 5G", 700, 256);
        phones[6] = new Phone("Huawei", "Mate 40 Pro", 800, 256);
        phones[7] = new Phone("Motorola", "Edge+", 1000, 256);
        phones[8] = new Phone("Sony", "Xperia 1 III", 1300, 256);
        phones[9] = new Phone("Nokia", "8.3 5G", 600, 128);

        for (Phone phone : phones) {
            System.out.println(phone.getName() + " " + phone.getModel() + ": " + phone.getCategory());
        }

        System.out.println();
        System.out.println("Only 'TOP' and 'SIMPLE' categories:");

        for (int i = 0; i < phones.length; i++) {
            Phone phone = phones[i];
            String category = phone.getCategory();
            if (category.equals("TOP") || category.equals("SIMPLE")) {
                System.out.println(phone.getName() + " " + phone.getModel() + ": " + category);
            }
        }
    }
}