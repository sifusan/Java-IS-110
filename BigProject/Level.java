import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import javafx.scene.control.Button;

public class Level {
    private String title;
    protected Line line;
    protected Character character;
    protected Pane pane;
    protected Button exitButton;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public Level(String title, Pane pane, Line line, Character character,
            Button exitButton) {
        this.title = title;
        this.pane = pane;
        this.line = line;
        this.character = character;
        this.exitButton = exitButton;
        pane.setStyle("-fx-background-color: LIGHTBLUE;");
    }
    
    public Level() {
        this("Level", new Pane(), new Line(), new Character(),
            new Button());
    }
    
    public Pane getPane() {
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
    
    public Line getLine() {
        return line;
    }
    
    public Character getCharacter() {
        return character;
    }
    
    public Button getExitButton() {
        return exitButton;
    }
}
