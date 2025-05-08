import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player 1");
        String name1 = input.nextLine();
        System.out.println("Enter player 2");
        String name2 = input.nextLine();
        Deck deck = new Deck();
        deck.shuffle();
        Hand player1 = new Hand(name1);
        Hand player2 = new Hand(name2);
        ArrayList<Hand>players=new ArrayList<>();
        players.add(player1);
        players.add(player2);
        for (Hand player:players){
            for (int i=0;i<2;i++){
                player.addCard(deck.dealCard());

            }
        }
        Hand winner=null;
        for (Hand player:players) {
            int score = player.getTotalPoints();

            if (score>21){
               continue;
            }
             if (winner==null||score> winner.getTotalPoints()) {
               winner=player;

            }
            }
        if (winner==null){
            System.out.println("No winner- everyone busted");
        }
        else {
            System.out.println("The winner is "+winner.getName()+" with "+winner.getTotalPoints()+" points!");
        }
    }
}