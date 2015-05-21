import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class HelpMenu extends Menu {
    public HelpMenu() {
        super("HelpMenu", new BorderPane());
        VBox vBox = new VBox(20);
        vBox.getChildren().add(getbtExit());
        pane.setBottom(vBox);
    }
}
