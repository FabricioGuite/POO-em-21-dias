package dia3.atividade2;

import java.util.LinkedList;

public class Deck {
    private LinkedList<Carta> deck;

    public Deck() {
        buildCartas();
    }

    public Carta get(int index) {
        if (index < deck.size()) {
            return deck.get(index);
        }
        return null;
    }

    public void replace(int index, Carta carta) {
        deck.set(index, carta);
    }

    public int size() {
        return deck.size();
    }

    public Carta removeFromFront() {
        if (deck.size() > 0) {
            return deck.removeFirst();
        }
        return null;
    }

    public void returnToBack(Carta carta) {
        deck.add(carta);
    }

    private void buildCartas() {
        deck = new LinkedList<>();
    
        // Adiciona todas as cartas de cada naipe
        for (int suit : new int[]{Carta.CLUBS, Carta.HEARTS, Carta.SPADES, Carta.DIAMONDS}) {
            deck.add(new Carta(suit, Carta.TWO));
            deck.add(new Carta(suit, Carta.THREE));
            deck.add(new Carta(suit, Carta.FOUR));
            deck.add(new Carta(suit, Carta.FIVE));
            deck.add(new Carta(suit, Carta.SIX));
            deck.add(new Carta(suit, Carta.SEVEN));
            deck.add(new Carta(suit, Carta.EIGHT));
            deck.add(new Carta(suit, Carta.NINE));
            deck.add(new Carta(suit, Carta.TEN));
            deck.add(new Carta(suit, Carta.JACK));
            deck.add(new Carta(suit, Carta.QUEEN));
            deck.add(new Carta(suit, Carta.KING));
            deck.add(new Carta(suit, Carta.ACE));
        }
    }
}

