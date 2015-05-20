import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class MainMenu extends Menu {
    private Button btStartGame = new Button("Start Game");
    private Button btLevels = new Button("Levels");
    private Button btHighScore = new Button("HighScore");
    private Button btQuit = new Button("Quit");
    private Button btHelp = new Button("Help");
    
    public MainMenu(String title, BorderPane pane) {
        super(title, pane);
    }
    
    public MainMenu() {
        super("Main Menu", new BorderPane());
        
        VBox vBox = new VBox(30);
        vBox.setPadding(new Insets(10, 10, 80, 10));
        vBox.getChildren().add(btStartGame);
        vBox.getChildren().add(btLevels);
        vBox.getChildren().add(btHighScore);
        vBox.getChildren().add(btHelp);
        vBox.getChildren().add(btQuit);
        pane.setLeft(vBox);
        
        StackPane bigTitlePane = new StackPane();
        Label label = new Label("SHAPY");
        label.setFont(Font.font("Courier", FontWeight.BOLD, 30));
        bigTitlePane.getChildren().add(label);
        pane.setTop(bigTitlePane);
    }
    
    public Button getbtStartGame() {
        return btStartGame;
    }
    
    public Button getbtLevels() {
        return btLevels;
    }
    
    public Button getbtHighScore() {
        return btHighScore;
    }
    
    public Button getbtHelp() {
        return btHelp;
    }
    
    public Button getbtQuit() {
        return btQuit;
    }  
}
