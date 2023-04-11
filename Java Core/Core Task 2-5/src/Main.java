import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Insert name? ");
                    String name = scanner.next();

                    System.out.print("Insert surname? ");
                    String surname = scanner.next();

                    System.out.print("Insert GPA? ");
                    double gpa = scanner.nextDouble();

                    Student student = new Student(name, surname, gpa);
                    students.add(student);
                    System.out.println("Student added!");
                    break;
                case 2:
                    System.out.println("List of students:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println((i+1) + ") " + students.get(i));
                    }
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
