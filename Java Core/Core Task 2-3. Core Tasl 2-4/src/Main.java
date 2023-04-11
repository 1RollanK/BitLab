public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "John", "Smith", 3.5);
        Student student2 = new Student(2, "Mary", "Johnson", 3.8);
        Student student3 = new Student(3, "David", "Brown", 4.0);
        Student student4 = new Student(4, "Anna", "Taylor", 3.7);
        Student student5 = new Student(5, "Michael", "Anderson", 3.9);
        Student student6 = new Student(6, "Jessica", "Wilson", 3.6);
        Student student7 = new Student(7, "Robert", "Miller", 3.2);
        Student student8 = new Student(8, "Emily", "Davis", 3.9);
        Student student9 = new Student(9, "Jacob", "Martinez", 3.5);
        Student student10 = new Student(10, "Ava", "Garcia", 4.0);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getStudentData());
        }
        Student topStudent = topStudent(students);
        System.out.println("The top student is: " + topStudent.getStudentData());
    }

    public static Student topStudent(Student[] students){
        Student topStudent = students[0];
        for(int i = 0; i < students.length; i++){
            if(students[i].gpa > topStudent.gpa){
                topStudent = students[i];
            }
        }
        return topStudent;
    }
}