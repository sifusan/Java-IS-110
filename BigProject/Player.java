import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Player {
    private String name;
    private int highScore;
    private ArrayList<Integer> scoreList;
    
    public Player(String name, int highScore) {
        this.name = name;
        this.highScore = highScore;
        scoreList = new ArrayList<Integer>();
        addNewPlayerScore(100);
        addNewPlayerScore(90);
    }
    
    public String getName() {
        return name;
    }
    
    public int getHighScore() {
        return highScore;
    }
    
    public void setHighScore(int score) {
        this.highScore = score;
    }
    
    public void addNewPlayerScore(int score) {
        scoreList.add(score);
        Collections.sort(scoreList);
        if (score > getHighScore()) {
            setHighScore(score);
        }
        
    }
}
    
    