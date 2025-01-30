package dia3.atividade2;
public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();

        Dealer fabricio = new Dealer(deck);

        fabricio.shuffle();
        System.out.println(fabricio.dealCarta().toString());
    }
}
