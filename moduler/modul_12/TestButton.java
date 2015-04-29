import javax.swing.JFrame;

public class TestButton {
    public static void main(String[] args) {
        Button button = new Button();
        button.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setSize(300, 200);
        button.setVisible(true);
    }
}
