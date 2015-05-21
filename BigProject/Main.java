import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Main extends Application {
    private MainMenu mainMenu;
    private LevelMenu levelMenu;
    private ScoreMenu scoreMenu;
    private HelpMenu helpMenu;
    
    @Override
    public void start(Stage primaryStage) {
        mainMenu = new MainMenu();
        levelMenu = new LevelMenu();
        scoreMenu = new ScoreMenu();
        helpMenu = new HelpMenu();
        
        Scene mainMenuScene = new Scene(
            mainMenu.getPane(), mainMenu.getWidth(), mainMenu.getHeight());
        Scene levelMenuScene = new Scene(
            levelMenu.getPane(), levelMenu.getWidth(), levelMenu.getHeight());
        Scene scoreMenuScene = new Scene(
            scoreMenu.getPane(), scoreMenu.getWidth(), scoreMenu.getHeight());
        Scene helpMenuScene = new Scene(
            helpMenu.getPane(), helpMenu.getWidth(), helpMenu.getHeight());
            
        primaryStage.setTitle(mainMenu.getTitle());
        primaryStage.setScene(mainMenuScene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
        
        mainMenu.getbtStartGame().setOnMouseClicked((e) -> {
            Game game = new Game();
            game.start(new Stage());
        });
        
        mainMenu.getbtLevels().setOnMouseClicked((e) -> {
            primaryStage.setScene(levelMenuScene);
            primaryStage.setTitle(levelMenu.getTitle());
        });
        
        mainMenu.getbtScores().setOnMouseClicked((e) -> {
            primaryStage.setScene(scoreMenuScene);
            primaryStage.setTitle(scoreMenu.getTitle());
        });
        
        mainMenu.getbtHelp().setOnMouseClicked((e) -> {
            primaryStage.setScene(helpMenuScene);
            primaryStage.setTitle(helpMenu.getTitle());
        });
        
        mainMenu.getbtQuit().setOnMouseClicked((e) -> {
            primaryStage.close();
        });
        
        levelMenu.getbtExit().setOnMouseClicked((e) -> {
            primaryStage.setScene(mainMenuScene);
            primaryStage.setTitle(mainMenu.getTitle());
            
        });
        
        scoreMenu.getbtExit().setOnMouseClicked((e) -> {
            primaryStage.setScene(mainMenuScene);
            primaryStage.setTitle(mainMenu.getTitle());
        });
        
        
        
                
        helpMenu.getbtExit().setOnMouseClicked((e) -> {
            primaryStage.setScene(mainMenuScene);
            primaryStage.setTitle(mainMenu.getTitle());
        });             
    }
}
