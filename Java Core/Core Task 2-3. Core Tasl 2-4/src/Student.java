public class Student {

    int id;
    String name;
    String surname;
    Double gpa;

    public Student () {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.gpa = 0.0;
    }

    public Student (int id, String name, String surname, Double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData () {
        return "ID: " + id + ". Name: " + name + ". Surname: " + surname + ". GPA: " + gpa + ".";
    }
}



