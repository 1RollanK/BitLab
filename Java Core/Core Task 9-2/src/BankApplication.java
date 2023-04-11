import java.util.ArrayList;
public class BankApplication {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public BankApplication(String name) {
        this.name = name;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i) {
        accounts.remove(i);
    }

    public Account getMaxAccount() {
        Account max = accounts.get(0);
        for (Account a : accounts) {
            if (a.getBalance() > max.getBalance()) {
                max = a;
            }
        }
        return max;
    }

    public double getAverageBalance() {
        double sum = 0;
        for (Account a : accounts) {
            sum += a.getBalance();
        }
        return sum / accounts.size();
    }

    public double getTotalBalance() {
        double sum = 0;
        for (Account a : accounts) {
            sum += a.getBalance();
        }
        return sum;
    }

    public int totalAccounts() {
        return accounts.size();
    }

    public String getBankData() {
        return "Bank name: " + name +
                "\nTotal accounts: " + totalAccounts() +
                "\nTotal balance: " + getTotalBalance() +
                "\nAverage balance: " + getAverageBalance();
    }
}
