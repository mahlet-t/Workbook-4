import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card>cards;

    public Deck() {
        cards =new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "J", "Q", "K", "A"};
        for (String suit:suits)
            for (String value:values){
                new Card(suit,value);
                cards.add(new Card(suit,value));

            }
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public Card dealCard(){
        return cards.remove(0);
    }





}