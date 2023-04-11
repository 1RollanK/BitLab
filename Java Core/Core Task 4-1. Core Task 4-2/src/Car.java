public class Car {
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;

    public Car() {
    }

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public void ride() {
        System.out.println("Car is riding");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Year: " + year);
        System.out.println("Volume: " + volume);
        System.out.println();
    }
}
