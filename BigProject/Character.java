import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
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
        System.out.println("Right");
    }
    
    public void moveLeft() {
        System.out.println("Left");
    }
    
    public void jump() {
    }
    
    public double getFallSpeed() {
        return FALL_SPEED;
    }
    
    public Rectangle getRectangle() {
        return rect;
    }
}
