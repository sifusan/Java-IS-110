import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.control.Button;

public class Game extends Application {
    private boolean done;
    private Level level;
    @Override
    public void start(Stage primaryStage) {
        Level level = new FirstLevel();
        Scene scene = new Scene(
            level.getPane(), level.getWidth(), level.getHeight());
        setCurrentLevel(level);
        primaryStage.setTitle(level.getTitle());
        primaryStage.setScene(scene);
        primaryStage.show();
        
        getCurrentLevel().getCharacter().getRectangle().setOnKeyPressed(
                (e) -> {
            if (e.getCode() == KeyCode.RIGHT) {
                getCurrentLevel().getCharacter().moveRight();
            }
            else if (e.getCode() == KeyCode.LEFT) {
                getCurrentLevel().getCharacter().moveLeft();
            }
        });
    }
    
    public void setCurrentLevel(Level level) {
        this.level = level;
    }
    
    public Level getCurrentLevel() {
        return level;
    }
}
