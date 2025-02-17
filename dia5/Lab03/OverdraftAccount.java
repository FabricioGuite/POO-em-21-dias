package dia5.Lab03;

public class OverdraftAccount extends BankAccount {
    
    // Dados privados
    private double creditRate;

    // Cria novo OverdraftAccount
    public OverdraftAccount(double initDeposit, double rate) {
        super(initDeposit);
        setCreditRate(rate);
    }

    // Cobra juros sobre qualquer dinheiro emprestado
    public void chargeInterest() {
        double balance = getBalance();
        if (balance < 0) {
            double charge = balance * getCreditRate();
            setBalance(balance + charge);
        }
    }

    // Consulta a taxa de crédito
    public double getCreditRate() {
        return creditRate;
    }

    // Configura a taxa de crédito
    public void setCreditRate(double rate) {
        this.creditRate = rate;
    }

    // Saca fundos da conta
    @Override
    public double withdrawFunds(double amount) {
        return super.withdrawFunds(amount); // Caso withdrawFunds exista em BankAccount
    }
}
