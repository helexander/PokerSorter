package project;

public class Card {

    private EnumCardValue value;
    private EnumCardSuit suit;

    // Splitting card to separate its value from suit
    public Card(String card) {
        value = EnumCardValue.valueOfCard(card.substring(0, 1));
        suit = EnumCardSuit.suitOfCard(card.substring(1, 2));
    }
}
