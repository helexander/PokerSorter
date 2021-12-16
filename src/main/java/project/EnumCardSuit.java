package project;

public enum EnumCardSuit {
    DIAMONDS("D"),
    HEARTS("H"),
    SPADES("S"),
    CLUBS("C");

    final String suit;

    EnumCardSuit(final String suit){
        this.suit = suit;
    }

    public static EnumCardSuit suitOfCard(String myCardSuit){
        for(EnumCardSuit el : EnumCardSuit.values()) {
            if (el.suit.equals(myCardSuit)) {
                return el;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return suit;
    }
}
