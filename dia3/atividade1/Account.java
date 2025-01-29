package dia3.atividade1;

public class Account {

    private Double saldo;

    public Account(){
        saldo = 0.0;
    }

    public Account(Double deposito_inicial){
        saldo = deposito_inicial;
    }

    public void deposito (Double valor){
        saldo = saldo + valor;
    }

    public Double getSaldo(){
        return saldo;
    }

    public double saque(Double valor){
        if(valor > saldo){
            valor = saldo;
        }

        saldo = saldo - valor;
        return valor;
    }    
}
