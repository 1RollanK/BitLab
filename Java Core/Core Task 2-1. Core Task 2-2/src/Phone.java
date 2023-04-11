public class Phone {
    String name;
    String model;
    int price;

    public Phone() {
        this.name = "";
        this.model = "";
        this.price = 0;
    }

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getData() {
        return "Name: " + this.name + ". Model: " + this.model + ". Price: " + this.price;
    }
}