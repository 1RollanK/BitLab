public abstract class Food {
    protected String name;

    public Food(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getCalories();
}
