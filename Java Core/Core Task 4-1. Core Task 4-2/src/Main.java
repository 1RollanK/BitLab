import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Focus", 180, 2015, 2.0);
        Car car2 = new Car("Chevrolet", "Camaro", 250, 2020, 3.6);
        Car car3 = new Car("Honda", "Civic", 170, 2019, 1.5);

        Toyota toyota1 = new Toyota("Toyota", "Camry", 200, 2021, 2.5, "Japan");
        Toyota toyota2 = new Toyota("Toyota", "Rav4", 190, 2018, 2.0, "Europe");
        Toyota toyota3 = new Toyota("Toyota", "Supra", 250, 2022, 3.0, "USA");

        Mercedes mercedes1 = new Mercedes("Mercedes-Benz", "E Class", 240, 2020, 2.0, "E Class");
        Mercedes mercedes2 = new Mercedes("Mercedes-Benz", "S Class", 280, 2021, 3.0, "S Class");
        Mercedes mercedes3 = new Mercedes("Mercedes-Benz", "M Class", 200, 2019, 2.0, "M Class");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(toyota1);
        cars.add(toyota2);
        cars.add(toyota3);
        cars.add(mercedes1);
        cars.add(mercedes2);
        cars.add(mercedes3);

        for (Car car:cars) {
            car.ride();
        }
    }
}