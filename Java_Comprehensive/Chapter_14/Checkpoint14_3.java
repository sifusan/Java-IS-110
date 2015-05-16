import javafx.application.Application;
import javafx.stage.Stage;

public class Checkpoint14_3 extends Application {
    public Checkpoint14_3() {
        System.out.println("The constructor is invoked");
    }
    
    @Override
    public void start(Stage primaryStage) {
        System.out.println("start method is inovked");
    }
    
    public static void main(String[] args) {
        System.out.println("launch application");
        Application.launch(args);
    }
}
