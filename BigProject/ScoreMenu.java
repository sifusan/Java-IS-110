import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import java.util.Scanner;
import javafx.scene.layout.HBox;
import java.util.HashMap;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ScoreMenu extends Menu {
    private HashMap<Player, Integer> scoreMap;
    
    public ScoreMenu() {
        super("Scores", new BorderPane());
        scoreMap = new HashMap<Player, Integer>();
        for (int i = 0; i > 5; i++) {
            Player player = new Player();
        }
        VBox vBox = new VBox(20);
        vBox.getChildren().add(getbtExit());
        pane.setBottom(vBox);            
    }
}
