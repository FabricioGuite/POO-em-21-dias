package dia5.Lab03;

public class SavingAccount extends BankAccount{
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public SavingAccount(double initBalance, double interestRate){
        super(initBalance);
        setInterestRate(interestRate);
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double balance = getBalance();
        double rate = getInterestRate();
        double interest = balance + rate;

        double new_balance = balance + interest;

        setBalance(new_balance);
        
    }
}
