import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
public class Player {
    private String name;
    private int highScore =  0;
    private ArrayList<Integer> scoreList;
    private Button okName;
    private TextField enterName;
    private Stage playerStage;
    
    public Player() {
        playerStage = new Stage();
        StackPane stackPane = new StackPane();
        Label promptName = new Label("Enter your name");
        enterName = new TextField();
        okName = new Button("OK");
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().add(promptName);
        vBox.getChildren().add(enterName);
        vBox.getChildren().add(okName);
        stackPane.getChildren().add(vBox);
        Scene playerScene = new Scene(
            stackPane, 300, 150);
        playerStage.setScene(playerScene);
        playerStage.setTitle("Name entry");
        playerStage.show();
        
        scoreList = new ArrayList<Integer>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
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
    public Button getOkName() {
        return okName;
    }
    public TextField getEnterName() {
        return enterName;
    }
    
    public Stage getPlayerStage() {
        return playerStage;
    }
}
    
    
