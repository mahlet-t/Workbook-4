import java.util.ArrayList;

public class Hand {
        private String name;
        private ArrayList<Card>hand;

    public Hand(String name) {
        this.name=name;
        hand=new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void addCard(Card card){
        hand.add(card);
    }
    public int getTotalPoints(){
       int total=0;
     for (Card card:hand){
         total+=card.getValue();
     }
      return total;
    }
}
