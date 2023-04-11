public class Programmers implements Workers {
    private int id;
    private String nickname;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    public String getWorkerData() {
        return "Staff member " + id + ": " + nickname;
    }

    public int getSalary() {
        return (int) (salary + KPIValue * bonusSalary);
    }
}