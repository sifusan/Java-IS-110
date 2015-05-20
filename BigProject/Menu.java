import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import java.util.Scanner;
import javafx.scene.layout.HBox;

public abstract class Menu {
    private String title;
    protected BorderPane pane;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    
    public Menu(String title, BorderPane pane) {
        this.title = title;
        this.pane = pane;
        pane.setStyle("-fx-background-color: LIGHTBLUE;");
    }
    
    public BorderPane getPane() {
        return pane;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getWidth() {
        return WIDTH;
    }
    
    public int getHeight() {
        return HEIGHT;
    }
    
    //public abstract Pane getPane();
}
