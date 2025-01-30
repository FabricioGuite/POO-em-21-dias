package dia3.atividade2;

public class Carta {

    private int rank;

    private int suit;
    private boolean face_up ;

    // constan tes usadas pa ra instancia r
    // na i pes
    public static final int DIAMONDS = 4;
    public static final int HEARTS = 3;
    public static final int SPADES = 6;
    public static final int CLUBS = 5;
    // valores
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9 ;
    public static final int TEN = 10;
    public static final int JACK = 74 ;
    public static final int QUEEN = 81 ;
    public static final int KING = 75 ;
    public static final int ACE = 65;
    
    //cria uma nova carta - usa apenas as constantes para inicializar
    public Carta(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit(){
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public void faceUp() {
        face_up = true;
    }

    public void faceDown(){
        face_up = false;
    }

    public boolean isFaceUp(){
        return face_up;
    }

    public String display() {
        String display;
        
        if (rank > 10) {
            display = String.valueOf((char) rank);
        } else {
            display = String.valueOf(rank);
        }
    
        switch (suit) {
            case DIAMONDS:
                return display + String.valueOf('♦');
            case HEARTS:
                return display + String.valueOf('♥');
            case SPADES:
                return display + String.valueOf('♠');
            case CLUBS:
                return display + String.valueOf('♣');
            default:
                return display + "?";
        }
    }

    @Override
    public String toString() {
        String rankStr = (rank > 10) ? String.valueOf((char) rank) : String.valueOf(rank);
        String suitStr;
        switch (suit) {
            case DIAMONDS -> suitStr = "♦";
            case HEARTS -> suitStr = "♥";
            case SPADES -> suitStr = "♠";
            case CLUBS -> suitStr = "♣";
            default -> suitStr = "?";
        }
        return rankStr + suitStr;
    }

    
}
