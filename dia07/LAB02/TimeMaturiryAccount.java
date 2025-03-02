package dia07.LAB02;

public class TimeMaturiryAccount extends SavingAccount{

    private boolean mature;
    private double feeRate;

    public TimeMaturiryAccount(double initBalance, double interestRate, double feeRate){
        super(initBalance, interestRate);
        setFeeRatte(feeRate);

    }

    public double withdrawFunds(double amount){
        super.withdrawFunds(amount);
        if(!isMature()){
            double charge = amount * getFeeRate();
            amount = amount - charge;
        }

        return amount;
    }
     public boolean isMature(){
        return mature;
    }

    public double getFeeRate(){
        return feeRate;
    }
    
    public void setFeeRatte(double rate){
        feeRate = rate;
    }

}
