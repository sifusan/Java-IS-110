import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Player {
    private String name;
    private int highScore;
    private ArrayList<Integer> scoreList;
    
    public Player(String name) {
        this.name = name;
        highScore = 0;
        scoreList = new ArrayList<Integer>();
        //addNewPlayerScore(100);
        //addNewPlayerScore(90);
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
    
    public void newScore(int score) {
        scoreList.add(score);
        Collections.sort(scoreList);
        if (score > getHighScore()) {
            setHighScore(score);
        }
        if (scoreList.size() > 10) {
            for (int i = scoreList.size() - 1; i > 10; --i) {
                scoreList.remove(i);
            }
        }
    }
}
    
    
