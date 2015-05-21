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
import javafx.scene.layout.GridPane;
import javafx.application.Application;
import javafx.scene.Scene;

public class LevelMenu extends Menu {
    
    private Button btExit = new Button("Back to Main Menu");
    
    public LevelMenu() {
        super("Level Menu", new BorderPane());
        VBox vBox = new VBox(20);
        vBox.getChildren().add(btExit);
        pane.setBottom(vBox);
    }
    
    public Button getbtExit() {
        return btExit;
    }
}
