package dia07.LAB03;

import dia07.LAB02.Bank;
import dia07.LAB02.CheckingAccount;
import dia07.LAB02.OverdraftAccount;
import dia07.LAB02.SavingAccount;
import dia07.LAB02.TimeMaturiryAccount;

public class BankDriver {

    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(5000.00, 5, 2.50);
        OverdraftAccount oa = new OverdraftAccount(10000.00, 0.18);
        SavingAccount sa = new SavingAccount(500.00, 0.02);
        TimeMaturiryAccount tma = new TimeMaturiryAccount(10000.00, 0.06, 0.05);

        Bank bank = new Bank();
        bank.addAccount("CHECKING", ca);
        bank.addAccount("OVERDRAFT", oa);
        bank.addAccount("SAVINGS", sa);
        bank.addAccount("TMA", tma);

        System.out.println("Total holdings(deve ser $25500.0):  $" + bank.totalHoldings());
        System.out.println("Total de contas(deve ser 4): " + bank.totalContas());

        RewardsAccount ra = new RewardsAccount(5000.00, 0.05, 500.00);
        bank.addAccount("REWARDS", ra);

        System.out.println("Total holdings(deve ser $30500.0):  $" + bank.totalHoldings());
        System.out.println("Total de contas(deve ser 5): " + bank.totalContas());

        bank.deposit("CHECKING", 250);
        double new_balance = bank.balance("CHECKING");
        System.out.println("CHECKING new balance (deve ser 5250): $" + new_balance);
    }

}
