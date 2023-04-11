public class Mercedes extends Car{
    private String classType;

    public Mercedes() {
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public void ride(){
        System.out.println("Car is riding");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Year: " + year);
        System.out.println("Volume: " + volume);
        System.out.println("Class type: " + classType);
        System.out.println();
    }
}
