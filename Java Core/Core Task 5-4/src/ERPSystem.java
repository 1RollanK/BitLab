public class ERPSystem {
    User[] memory = new User[1000];
    int sizeOfUsers = 0;

    public void addUser(User u) {
        memory[sizeOfUsers++] = u;
    }

    public void printAllUsers() {
        for (int i = 0; i < sizeOfUsers; i++) {
            System.out.println(memory[i].getUserData());
        }
    }

    public void printUser(int index) {
        if (index < 0 || index >= sizeOfUsers) {
            System.out.println("No such user in this index");
        } else {
            System.out.println(memory[index].getUserData());
        }
    }
}
