import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.shape.Arc;
import javafx.util.Duration;

public class Character {
    private Rectangle rect;
    private int points = 0;
    
    public Character(Rectangle rect) {
        this.rect = rect;
    }
    
    public Character() {
        this(new Rectangle(10, 100));
        rect.setFill(Color.RED);
    }
    
    public void moveRight() {
        rect.setX(rect.getX() + 3);
        setPoints(getPoints() + 1);
        System.out.println(getPoints());
    }
    
    public void moveLeft() {
        rect.setX(rect.getX() - 3);
        if (getPoints() > 0) {
            setPoints(getPoints() - 1);
            System.out.println(getPoints());
        }
    }
    
    public void jump() {
        PathTransition jump = new PathTransition();
        Arc path = new Arc();
        path.setCenterX(rect.getX() + rect.getWidth() / 2 + 20);
        path.setCenterY(rect.getY() + rect.getHeight() / 2);
        path.setRadiusX(40);
        path.setRadiusY(80);
        path.setStartAngle(180);
        path.setLength(-180);
         
        jump.setPath(path);
        jump.setNode(rect);
        jump.setDuration(Duration.millis(1500));
        jump.play();
        
        rect.setX(path.getCenterX() + path.getRadiusX() + 15);
    }
    
    public Rectangle getRectangle() {
        return rect;
    }
    
    private int getPoints() {
        return points;
    }
    
    private void setPoints(int points) {
        this.points = points;
    }
}
