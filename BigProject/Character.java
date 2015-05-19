import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
public class Character {
    private Rectangle rect;
    private final double FALL_SPEED = 9.81;
    
    //public Character(Rectangle rect) {
      //  this.rect = rect;
        //System.out.println("test");
    //}
    
    public Character() {
        //rect.setFill(Color.RED);
        System.out.println("test");
    }
    
    public void moveRight() {
    }
    
    public void moveLeft() {
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
