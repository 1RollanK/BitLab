public class Coke extends Food {
    private double volumeLiters;
    private boolean isSparkling;

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    @Override
    public double getCalories() {
        if (isSparkling) {
            return volumeLiters * 400.0;
        } else {
            return volumeLiters * 100.0;
        }
    }
}