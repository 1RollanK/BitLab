public class Student {
    private String name;
    private String surname;
    private double gpa;

    public Student(String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String toString() {
        return name + " " + surname + " " + gpa;
    }
}