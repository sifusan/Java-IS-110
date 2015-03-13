import java.util.HashMap;

public class Deck {
    
    private Integer[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
    private HashMap<String, Integer> deckOfCards;
    
    public Deck() {
        System.out.println("You have made a new deck");
        deckOfCards = new HashMap<String, Integer>();
        makeDeck();
    }
    
    public void getDeck() {
        System.out.println("test");
    }
    
    public void makeDeck() {
        for (int i: ranks)
            for (String j: suits)
                
                deckOfCards.put(i, j);
        System.out.println(deckOfCards);
                    
    }
        
}
