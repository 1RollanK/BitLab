public class Burger extends Food{
    private int meatAmount;
    private int meatType;

    public Burger(String name, int meatAmount, int meatType){
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    public double getCalories() {
        if (meatType == 1) { // Говядина
            return meatAmount * 840.0;
        } else if (meatType == 2) { // Курица
            return meatAmount * 560.0;
        } else {
            return 0.0;
        }
    }
}
