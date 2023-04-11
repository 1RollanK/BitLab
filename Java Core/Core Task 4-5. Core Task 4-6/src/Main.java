import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        // создание объектов класса User
        User user1 = new User(1, "user1", "password1", "John", "Doe");
        User user2 = new User(2, "user2", "password2", "Jane", "Doe");
        User user3 = new User(3, "user3", "password3", "Bob", "Smith");
        User user4 = new User(4, "user4", "password4", "Alice", "Smith");
        User user5 = new User(5, "user5", "password5", "David", "Johnson");

        // добавление пользователей в массив users
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        // создание объектов класса Staff
        Staff staff1 = new Staff(6, "staff1", "password6", "Mark", "Lee", 1500);
        Staff staff2 = new Staff(7, "staff2", "password7", "Emily", "Chen", 2000);
        Staff staff3 = new Staff(8, "staff3", "password8", "Chris", "Kim", 1800);
        Staff staff4 = new Staff(9, "staff4", "password9", "Samantha", "Wong", 1700);
        Staff staff5 = new Staff(10, "staff5", "password10", "Alex", "Garcia", 1900);

        // добавление преподавателей в массив users
        users.add(staff1);
        users.add(staff2);
        users.add(staff3);
        users.add(staff4);
        users.add(staff5);

        // создание объектов класса Student
        Student student1 = new Student(11, "student1", "password11", "Tom", "Smith", 3.8);
        Student student2 = new Student(12, "student2", "password12", "Megan", "Johnson", 3.6);
        Student student3 = new Student(13, "student3", "password13", "Jake", "Lee", 3.5);
        Student student4 = new Student(14, "student4", "password14", "Avery", "Chen", 3.9);
        Student student5 = new Student(15, "student5", "password15", "Eric", "Wong", 3.7);

        // добавление студентов в массив users
        users.add(student1);
        users.add(student2);
        users.add(student3);
        users.add(student4);
        users.add(student5);

        // добавление курсов для каждого пользователя
        for (User user : users) {
            if (user instanceof Staff) {
                Staff staff = (Staff) user;
                staff.addSubject("Math");
                staff.addSubject("Physics");
                staff.addSubject("Chemistry");
            } else if (user instanceof Student) {
                Student student = (Student) user;
                student.addCourse("Java, Python");
                student.addCourse("Data Structures");
                student.addCourse("Algorithms");
            }
        }


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("[1] ADD USER");
            System.out.println("[2] LIST USERS");
            System.out.println("[3] LIST STUDENTS");
            System.out.println("[4] LIST STAFF");
            System.out.println("[0] EXIT");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n=== ADD USER ===");
                    System.out.println("[1] ADD STUDENT");
                    System.out.println("[2] ADD STAFF");
                    int userType = scanner.nextInt();
                    scanner.nextLine();
                    if (userType == 1) {
                        System.out.println("Enter student ID:");
                        int studentId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter student username:");
                        String studentUsername = scanner.nextLine();
                        System.out.println("Enter student password:");
                        String studentPassword = scanner.nextLine();
                        System.out.println("Enter student first name:");
                        String studentFirstName = scanner.nextLine();
                        System.out.println("Enter student last name:");
                        String studentLastName = scanner.nextLine();
                        System.out.println("Enter student GPA:");
                        double studentGPA = scanner.nextDouble();
                        scanner.nextLine();
                        Student student = new Student(studentId, studentUsername, studentPassword,
                                studentFirstName, studentLastName, studentGPA);
                        users.add(student);
                        System.out.println("Student added successfully!");
                    } else if (userType == 2) {
                        System.out.println("Enter staff ID:");
                        int staffId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter staff username:");
                        String staffUsername = scanner.nextLine();
                        System.out.println("Enter staff password:");
                        String staffPassword = scanner.nextLine();
                        System.out.println("Enter staff first name:");
                        String staffFirstName = scanner.nextLine();
                        System.out.println("Enter staff last name:");
                        String staffLastName = scanner.nextLine();
                        System.out.println("Enter staff salary:");
                        double staffSalary = scanner.nextDouble();
                        scanner.nextLine();
                        Staff staff = new Staff(staffId, staffUsername, staffPassword,
                                staffFirstName, staffLastName, staffSalary);
                        users.add(staff);
                        System.out.println("Staff added successfully!");
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;
                case 2:
                    System.out.println("\n=== LIST USERS ===");
                    for (User user : users) {
                        user.getData();
                    }
                    break;
                case 3:
                    System.out.println("\n=== LIST STUDENTS ===");
                    for (User user : users) {
                        if (user instanceof Student) {
                            user.getData();
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n=== LIST STAFF ===");
                    for (User user : users) {
                        if (user instanceof Staff) {
                            user.getData();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
