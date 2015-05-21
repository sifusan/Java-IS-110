import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class FirstLevel extends Level {
    private Rectangle obstacle;
    
    public FirstLevel() {
        super("Level 1", new Pane(), new Line(), new Character(),
                new Button("Exit Level"));
        
        line.setStartX(0);
        line.setStartY(getHeight() / 2 + 60);
        line.setEndX(getWidth());
        line.setEndY(getHeight() / 2 + 60);
        line.setStrokeWidth(7);
        pane.getChildren().add(line);
        
        obstacle = new Rectangle(100, 100);
        obstacle.setX(line.getEndX() / 2);
        obstacle.setY(line.getEndY() - obstacle.getHeight());
        pane.getChildren().add(obstacle);
        
        character.getRectangle().setX(line.getStartX() + 30);
        character.getRectangle().setY(line.getStartY() - 100);
        pane.getChildren().add(character.getRectangle());
    }
}   
    
