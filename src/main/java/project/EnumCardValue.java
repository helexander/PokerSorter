package project;

public enum EnumCardValue {
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("T", 10),
    JACK("J", 11),
    QUEEN("Q", 12),
    KING("K", 13),
    ACE("A", 14);

    final String text;
    final Integer val;

    EnumCardValue(final String text, Integer val){
        this.text = text;
        this.val = val;
    }

    public static EnumCardValue valueOfCard(String myCardVal){
        for(EnumCardValue el : EnumCardValue.values()) {
            if (el.text.equals(myCardVal)) {
                return el;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return text;
    }
}
