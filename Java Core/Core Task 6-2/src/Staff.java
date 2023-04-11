public class Staff implements Workers{
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Staff(int id, String name, String surname, int salary){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getWorkerData() {
        return "Staff member " + id + ": " + name + " " + surname;
    }

    public int getSalary() {
        return salary;
    }
}