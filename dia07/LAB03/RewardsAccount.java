package dia07.LAB03;

import dia07.LAB02.SavingAccount;

public class RewardsAccount extends SavingAccount {
    
    private double min_reward_balance;
    private int qualifying_deposits;


    public RewardsAccount(double initDeposit, double interest, double min){
        super(initDeposit, interest);  
        this.min_reward_balance = min; 
    }

    @Override
    public void depositFunds(double amount){
        super.depositFunds(amount);
        if(amount >= min_reward_balance){
            qualifying_deposits++; 
        }
    }

    public int getRewardsEarned(){
        return qualifying_deposits;
    }

    public void resetReward(){
        qualifying_deposits = 0;
    }

    public double getMinimumRewardBalance(){
        return min_reward_balance;
    }

    public void setMinimumRewardBalance(double min){
        min_reward_balance = min;
    }
}
