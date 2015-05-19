import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;

public class Game extends Application {
    private boolean done;
    @Override
    public void start(Stage primaryStage) {
        MainMenu mainMenu = new MainMenu();
        
        Scene scene = new Scene(
            mainMenu.getPane(), mainMenu.getWidth(), mainMenu.getHeight());
            
        primaryStage.setTitle(mainMenu.getTitle());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
        
        mainMenu.getbtStartGame().setOnMouseClicked((e) -> {
            Level level = new FirstLevel();
            Scene lvlScene = new Scene(
                level.getPane(), level.getWidth(), level.getHeight());
            primaryStage.setTitle(level.getTitle());
            primaryStage.setScene(lvlScene);
            primaryStage.sizeToScene();
        });
    }
}
