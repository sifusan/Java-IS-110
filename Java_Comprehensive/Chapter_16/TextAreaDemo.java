import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class TextAreaDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        DescriptionPane descriptionPane = new DescriptionPane();
        
        descriptionPane.setTitle("USA");
        String description = "The American Flag";
        descriptionPane.setImageView(new ImageView("us.jpg"));
        descriptionPane.setDescription(description);
        
        Scene scene = new Scene(descriptionPane, 500, 300);
        primaryStage.setTitle("TextAreaDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
