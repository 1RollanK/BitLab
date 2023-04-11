import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();

        // Создаем экземпляры классов Chocolate, Burger и Coke
        Chocolate snickers = new Chocolate("Snickers", 1);
        Chocolate twix = new Chocolate("Twix", 2);
        Burger burgerKing = new Burger("Burger King", 2, 1);
        Burger mcdonalds = new Burger("McDonalds", 1, 2);
        Coke cocaCola = new Coke("Coca Cola", 1.5, true);
        Coke fuseTea = new Coke("Fuse Tea", 0.5, false);

        // Добавляем все объекты в ArrayList
        foods.add(snickers);
        foods.add(twix);
        foods.add(burgerKing);
        foods.add(mcdonalds);
        foods.add(cocaCola);
        foods.add(fuseTea);

        // Выводим название всех товаров и их калории
        for (Food food : foods) {
            System.out.println(food.getName() + " - " + food.getCalories() + " калорий");
        }

        // Находим самую калорийную еду и выводим ее название и калории
        double maxCalories = Double.MIN_VALUE;
        Food mostCaloricFood = null;
        for (Food food : foods) {
            if (food.getCalories() > maxCalories) {
                maxCalories = food.getCalories();
                mostCaloricFood = food;
            }
        }
        System.out.println("\nСамая калорийная еда - " + mostCaloricFood.getName() + " (" + maxCalories + " калорий)");
    }
}
