public class UserBeanImp implements UserBean {
    private Users[] users;

    public UserBeanImp(Users[] users) {
        this.users = users;
    }

    public void getAllUsers() {
        for (Users user : users) {
            System.out.println(user.getName() + " " + user.getSurname());
        }
    }
    public void getUsersByName(String name) {
        for (Users user: users){
            if(user.getName().equals(name)){
                System.out.println(user.getName() + " " + user.getSurname());
            }
        }
    }
    public void getUsersBySurname(String surname) {
        for (Users user:users){
            if(user.getSurname().equals(surname)){
                System.out.println(user.getName() + " " + user.getSurname());
            }
        }
    }
}
