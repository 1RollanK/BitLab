public class Swimmer extends Sportsman{
    String style;
    double recordTime;

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    public void play() {
        System.out.println(fullName + " " + age + " " + country + " " + style + " " + recordTime + " is playing.");
    }
}
