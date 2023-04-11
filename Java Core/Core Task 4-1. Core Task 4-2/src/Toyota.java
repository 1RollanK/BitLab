public class Toyota extends Car{
    private String manufacturer;

    public Toyota() {
    }

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public void ride(){
        System.out.println("Car is riding");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Year: " + year);
        System.out.println("Volume: " + volume);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println();
    }
}
