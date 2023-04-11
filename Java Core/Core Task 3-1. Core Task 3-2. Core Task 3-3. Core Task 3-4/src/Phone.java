public class Phone {
    private String name;
    private String model;
    private int price;
    private int memory;

    public Phone(){
        this.name = "";
        this.model = "";
        this.price = 0;
        this.memory = 0;
    }

    public Phone(String name, String model, int price, int memory){
        this.name = name;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public int getMemory() {
        return price;
    }

    public void setMemory() {
        this.memory = memory;
    }

    public String getCategory() {
        if (price > 1000) {
            return "TOP";
        } else if (price > 500) {
            return "MEDIUM";
        } else {
            return "SIMPLE";
        }
    }
}
