public class Chocolate extends Food{
    private int weight;

    public Chocolate (String name, int weight){
        super(name);
        this.weight = weight;
    }

    public double getCalories(){
        return weight*740;
    }
}
