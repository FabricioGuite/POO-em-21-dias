package dia07.LAB02;

public class CheckingAccount extends BankAccount{

    private int monthlyQuota;
    private int transactionCount;
    private double fee;
    
    public CheckingAccount(double initDeposit, int trans, double fee){
        super(initDeposit);
        setMonthlyQuota(trans);
        setFee(fee);
    }
        // Sobrescreve withdrawFunds de BankAccount
    @Override
    public double withdrawFunds(double amount) {
        transactionCount++;
        return super.withdrawFunds(amount);
    }

    // Acessa as taxas se ultrapassou o limite de transações
    public void accessFees() {
        int extra = getTransactionCount() - getMonthlyQuota();
        if (extra > 0) {
            double totalFee = extra * getFee();
            double balance = getBalance() - totalFee;
            setBalance(balance);
        }
        transactionCount = 0;
    }

    // Alguns métodos de obtenção e configuração
    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getMonthlyQuota() {
        return monthlyQuota;
    }

    public void setMonthlyQuota(int quota) {
        this.monthlyQuota = quota;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    
}
