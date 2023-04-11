import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankApplication> allBanks = new ArrayList<>();

        BankApplication bank1 = new BankApplication("Bank 1");
        for (int i = 1; i <= 10; i++) {
            Account account = new Account(i, "Name" + i, "Surname" + i, i * 1000);
            bank1.addAccount(account);
        }
        allBanks.add(bank1);

        BankApplication bank2 = new BankApplication("Bank 2");
        for (int i = 11; i <= 20; i++) {
            Account account = new Account(i, "Name" + i, "Surname" + i, (i - 10) * 2000);
            bank2.addAccount(account);
        }
        allBanks.add(bank2);

        BankApplication bank3 = new BankApplication("Bank 3");
        for (int i = 21; i <= 30; i++) {
            Account account = new Account(i, "Name" + i, "Surname" + i, (i - 20) * 500);
            bank3.addAccount(account);
        }
        allBanks.add(bank3);

        // Сортировка по среднему значению баланса
        for (int i = 0; i < allBanks.size() - 1; i++) {
            for (int j = i + 1; j < allBanks.size(); j++) {
                double balanceI = allBanks.get(i).getAverageBalance();
                double balanceJ = allBanks.get(j).getAverageBalance();
                if (balanceI < balanceJ) {
                    BankApplication temp = allBanks.get(i);
                    allBanks.set(i, allBanks.get(j));
                    allBanks.set(j, temp);
                }
            }
        }

        // Вывод информации о каждом банке
        for (BankApplication bank : allBanks) {
            System.out.println(bank.getBankData());
        }
    }
}
