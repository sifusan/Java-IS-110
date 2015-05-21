import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        MainMenu mainMenu = new MainMenu();
        LevelMenu levelMenu = new LevelMenu();
        ScoreMenu scoreMenu = new ScoreMenu();
        
        Scene mainMenuScene = new Scene(
            mainMenu.getPane(), mainMenu.getWidth(), mainMenu.getHeight());
        Scene levelMenuScene = new Scene(
            levelMenu.getPane(), levelMenu.getWidth(), levelMenu.getHeight());
        Scene scoreMenuScene = new Scene(
            scoreMenu.getPane(), scoreMenu.getWidth(), scoreMenu.getHeight());
        
        
            
        primaryStage.setTitle(mainMenu.getTitle());
        primaryStage.setScene(mainMenuScene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
        
        mainMenu.getbtStartGame().setOnMouseClicked((e) -> {
            primaryStage.close();
            Game game = new Game();
            game.start(new Stage());
        });
        
        mainMenu.getbtLevels().setOnMouseClicked((e) -> {
            primaryStage.setScene(levelMenuScene);
            primaryStage.setTitle(levelMenu.getTitle());
            primaryStage.sizeToScene();
        });
        
        mainMenu.getbtScores().setOnMouseClicked((e) -> {
            primaryStage.setScene(scoreMenuScene);
        });
        
        levelMenu.getbtExit().setOnMouseClicked((e) -> {
            primaryStage.setScene(mainMenuScene);
            primaryStage.setTitle(mainMenu.getTitle());
            
        });         
    }
}
