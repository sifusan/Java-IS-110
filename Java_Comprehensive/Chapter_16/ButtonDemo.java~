import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;


public class ButtonDemo extends Application {
    protected Text text = new Text(50, 50, "JavaFX Programming!");
    
    protected BorderPane getPane() {
        HBox paneForButtons = new HBox();
        Button btLeft = new Button("Left",
            new ImageView("us.jpg"));
        Button btRight = new Button("Right",
            new ImageView("us.jpg"));
        paneForButtons.getChildren().addAll(btLeft, btRight);
        
        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);
        
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);
        
        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));
        
        return pane;
    }
    
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(getPane(), 450, 200);
        primaryStage.setTitle("ButtonDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
        
