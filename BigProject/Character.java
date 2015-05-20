import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.shape.Arc;
import javafx.util.Duration;

public class Character {
    private Rectangle rect;
    private final double FALL_SPEED = 9.81;
    private final int MOVE_SPEED = 10;
    
    public Character(Rectangle rect) {
        this.rect = rect;
    }
    
    public Character() {
        this(new Rectangle(10, 100));
        rect.setFill(Color.RED);
    }
    
    public void moveRight() {
        rect.setX(rect.getX() + 3);
        System.out.println("right");
    }
    
    public void moveLeft() {
        rect.setX(rect.getX() - 3);
        System.out.println("left");
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
        //jump.setAutoReverse(false);
        jump.setDuration(Duration.millis(1500));
        //jump.setCycleCount(1);
        jump.play();
        
        rect.setX(path.getCenterX() + path.getRadiusX() + 15);
        System.out.println("jump");
    }
    
    public double getFallSpeed() {
        return FALL_SPEED;
    }
    
    public Rectangle getRectangle() {
        return rect;
    }
}
