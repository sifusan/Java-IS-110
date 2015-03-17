import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

public class CardGame {
    
    public static void main(String[] args) {
    
    Deck deck = new Deck();
    
    }
}


class Deck {
    
    private ArrayList<String> deckOfCards;
    private String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
    private Integer[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    
    public Deck() {
        deckOfCards = new ArrayList<String>();
        
        int sum = 0;
        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)
                deckOfCards.add(suits[i]);
                sum++;
        
        System.out.println(sum);
        
                           
    }
}

    
class Player {
    
    public Player() {
    
    }
}    
