package dia07.LAB02;

import java.util.Hashtable;

public class Bank {
    
    private Hashtable<String, BankAccount> contas = new Hashtable<>();

    public void addAccount(String name, BankAccount conta){
        contas.put(name, conta);
    }

    public double totalHoldings(){
        double total = 0;
        for (BankAccount conta : contas.values()) {
            total += conta.getBalance();
        }
        return total;
    }

    public int totalContas(){
        return contas.size();
    }

    public void deposit(String name, double amount){
        BankAccount conta = retrieveConta(name);
        if(conta != null){
            conta.depositFunds(amount);
        }
    }

    public double balance(String name){
        BankAccount conta = retrieveConta(name);
        if(conta != null){
            return conta.getBalance();
        }
        return 0.0;
    }

    private BankAccount retrieveConta(String name){
        return contas.get(name);
    }
}
