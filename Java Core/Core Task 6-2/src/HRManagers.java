public class HRManagers implements Workers {
    private int id;
    private String fullName;
    private int salary;

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getWorkerData() {
        return "Staff member " + id + ": " + fullName;
    }

    public int getSalary() {
        return salary;
    }
}