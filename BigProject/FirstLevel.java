import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

public class FirstLevel extends Level {
    private Rectangle obstacle;
    
    public FirstLevel() {
        super("Level 1", new Pane(), new Line(), new Character());
        obstacle = new Rectangle(100, 100);
        line.setStartX(0);
        line.setStartY(getHeight() / 2 + 60);
        line.setEndX(getWidth());
        line.setEndY(getHeight() / 2 + 60);
        line.setStrokeWidth(7);
        pane.getChildren().add(line);
        
        obstacle.setX(line.getEndX() / 2);
        obstacle.setY(line.getEndY() - obstacle.getHeight());
        pane.getChildren().add(obstacle);
        
        //pane.getChildren().add(character.getRectangle());
    }
}   
    
