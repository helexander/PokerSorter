package project;

public class Main {
    public static final String VALID_PATTERN = "([1-9TKQJA][DHSC]\\s?){10}";

    public static void main(String[] args){
        enum cardVal {
            TWO("2", 2);

            final String text;
            final Integer val;

            cardVal(final String text, Integer val){
                this.text = text;
                this.val = val;
            }
        }
        
        String testInput = "4H 4C 6S 7S KD 2C 3S 9S 9D TD";

        // Regex check for input
        if(!testInput.matches(Main.VALID_PATTERN)){
           throw new Error("The input was not valid");
        }

        // Dividing cards among player 1 and player 2
        String p1_hand = testInput.substring(0, 14);
        String p2_hand = testInput.substring(15, 29);

        System.out.printf("Player 1 hand: %s\n", p1_hand);
        System.out.printf("Player 2 hand: %s", p2_hand);


    }
}
