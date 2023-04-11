import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Engine> engines = new ArrayList<>();

        // создаем 5 объектов FerrariEngine с разными параметрами и добавляем их в список
        engines.add(new FerrariEngine(2.0, 4, 200.0));
        engines.add(new FerrariEngine(2.5, 6, 250.0));
        engines.add(new FerrariEngine(3.0, 8, 300.0));
        engines.add(new FerrariEngine(4.0, 12, 400.0));
        engines.add(new FerrariEngine(6.0, 12, 600.0));

        // создаем 5 объектов RenaultEngine с разными параметрами и добавляем их в список
        engines.add(new RenaultEngine(1.6, 4, 120.0, 50.0));
        engines.add(new RenaultEngine(2.0, 4, 150.0, 75.0));
        engines.add(new RenaultEngine(2.5, 6, 200.0, 100.0));
        engines.add(new RenaultEngine(3.0, 8, 250.0, 125.0));
        engines.add(new RenaultEngine(4.0, 12, 300.0, 150.0));

        // выводим максимальную скорость каждого объекта
        for (Engine engine : engines) {
            System.out.println("Max speed: " + engine.getMaxSpeed());
        }
    }
}
