package dia3.atividade2;

public class Dealer {
    private Deck deck;

    public Dealer(Deck d) {
        deck = d;
    }

    public void shuffle() {
        // Torna o array de cartas aleatório
        int num_cartas = deck.size();
        for (int i = 0; i < num_cartas; i++) {
            int index = (int) (Math.random() * num_cartas);
            Carta carta_i = deck.get(i);
            Carta carta_index = deck.get(index);
            deck.replace(i, carta_index);
            deck.replace(index, carta_i);
        }
    }

    public Carta dealCarta() {
        if (deck.size() > 0) {
            return deck.removeFromFront();
        }
        return null;
    }
}