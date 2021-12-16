package project;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String VALID_PATTERN = "([1-9TKQJA][DHSC]\\s?){10}";

    public static void main(String[] args){
        String testInput = "4H 4C 6S 7S KD 2C 3S 9S 9D TD";

        // Regex check for input
        if(!testInput.matches(Main.VALID_PATTERN)){
           throw new Error("The input was not valid");
        }

        // Dividing cards among player 1 and player 2
        String p1_hand = testInput.substring(0, 14);
        String p2_hand = testInput.substring(15, 29);

        System.out.printf("Player 1 hand: %s\n", p1_hand);
        System.out.printf("Player 2 hand: %s\n", p2_hand);

        // To test, print out card value and card suit in the form of its enum value
        List<Card> cards = new ArrayList<Card>();

        // Would require to assign the cards to a hand
        cards.add(new Card(p1_hand.substring(0, 2)));
        cards.add(new Card(p1_hand.substring(3, 5)));
        cards.add(new Card(p1_hand.substring(6, 8)));
        cards.add(new Card(p1_hand.substring(9, 11)));
        cards.add(new Card(p1_hand.substring(12, 14)));

        System.out.printf("\nThese are player 1's cards: %s", cards.toString());
    }
}
