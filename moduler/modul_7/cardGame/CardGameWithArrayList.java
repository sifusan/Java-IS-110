import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

public class CardGame {
    
    public static void main(String[] args) {
    
    Deck deck = new Deck();
    
    }
}


class Deck {
    
    private ArrayList<String> suits;
    private ArrayList<Integer> ranks;
    
    public Deck() {
        suits = new ArrayList<String>();
        ranks = new ArrayList<Integer>();
        
        makeDeck();
        
    }
    
    public void makeDeck() {
        suits.add("Spades");
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Clubs");
        System.out.println(suits);
        
        ranks.add(1);
        ranks.add(2);
        ranks.add(3);
        ranks.add(4);
        ranks.add(5);
        ranks.add(6);
        ranks.add(7);
        ranks.add(8);
        ranks.add(9);
        ranks.add(10);
        ranks.add(11);
        ranks.add(12);
        ranks.add(13);
        System.out.println(ranks.indexOf(2) + " of " + suits.indexOf(0));
    }
}
    
class Player {
    
    public Player() {
    
    }
}    
