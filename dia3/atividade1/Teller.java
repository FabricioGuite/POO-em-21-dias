package dia3.atividade1;

public class Teller {
    public static void main(String[] args){
        Account conta1 = new Account();
        Account conta2 = new Account(500.0);

        System.out.println("conta 1 " + conta1.getSaldo());
        System.out.println("conta 2 " + conta2.getSaldo());  

        conta1.deposito(250.0);
        conta2.deposito(30.0);

        System.out.println("conta 1 " + conta1.getSaldo());
        System.out.println("conta 2 " + conta2.getSaldo());  

        conta1.saque(65.3);
        conta2.saque(1000.0);

        System.out.println("conta 1 " + conta1.getSaldo());
        System.out.println("conta 2 " + conta2.getSaldo());  
    }
    
}
