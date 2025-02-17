package dia5.Lab03;

public class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double initDeposit){
        setBalance(initDeposit);
    }

    public void depositFunds(double amount){
        setBalance(getBalance() + amount);
    }

    public double withdrawFunds(double amount){
        if(amount >= balance){
            amount = balance;
        }
        setBalance(getBalance() + amount);

        return amount;
    }
    
}
