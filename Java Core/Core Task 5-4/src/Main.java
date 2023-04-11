import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ERPSystem erpSystem = new ERPSystem();
        Scanner scanner = new Scanner(System.in);
        int id =0;

        while (true) {
            System.out.println("PRESS [1] TO ADD USER\n" +
                    "PRESS [2] TO LIST USERS\n" +
                    "PRESS [3] TO LIST USER BY INDEX\n" +
                    "PRESS [0] TO EXIT");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT\n" +
                        "PRESS [2] TO ADD TEACHER");
                int userType = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Login:");
                String login = scanner.nextLine();
                System.out.println("Password:");
                String password = scanner.nextLine();
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Surname:");
                String surname = scanner.nextLine();

                if (userType == 1) {
                    System.out.println("Group:");
                    String group = scanner.nextLine();
                    System.out.println("GPA:");
                    double gpa = scanner.nextDouble();
                    scanner.nextLine();
                    id++;

                    Student student = new Student(id,login, password, name, surname, group, gpa);
                    erpSystem.addUser(student);
                } else if (userType == 2) {
                    System.out.println("Nick Name:");
                    String nickName = scanner.nextLine();
                    System.out.println("Status:");
                    String status = scanner.nextLine();
                    id++;

                    Teacher teacher = new Teacher(id, login, password, nickName, status);
                    while (true) {
                        System.out.println("PRESS [1] TO ADD SUBJECT\n" +
                                "PRESS [0] TO FINISH ADDING SUBJECT");
                        int subjectChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (subjectChoice == 0) {
                            break;
                        } else if (subjectChoice == 1) {
                            System.out.println("Subject:");
                            String subject = scanner.nextLine();
                            teacher.addSubject(subject);
                        } else {
                            System.out.println("Invalid input");
                        }
                    }

                    erpSystem.addUser(teacher);
                } else {
                    System.out.println("Invalid input");
                }
            } else if (choice == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS\n" +
                        "PRESS [2] TO LIST TEACHERS");
                int userType = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < erpSystem.sizeOfUsers; i++) {
                    if (userType == 1 && erpSystem.memory[i] instanceof Student) {
                        System.out.println(erpSystem.memory[i].getUserData());
                    } else if (userType == 2 && erpSystem.memory[i] instanceof Teacher) {
                        System.out.println(erpSystem.memory[i].getUserData());
                    }
                }
                if (userType != 1 && userType != 2) {
                    System.out.println("Invalid input");
                }


            } else if (choice == 3) {
                System.out.println("ENTER INDEX:");
                int index = scanner.nextInt();
                scanner.nextLine();

                erpSystem.printUser(index);
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
