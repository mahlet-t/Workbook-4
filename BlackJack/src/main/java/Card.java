public class Card {
    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;

    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        if (value.equals("J")||value.equals("K")||value.equals("Q")){
            return 10;
        } else if (value.equals("A")) {
            return 11;
        } else  {
            return Integer.parseInt(value);

        }


    }
}