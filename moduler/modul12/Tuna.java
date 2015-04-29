import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tuna extends JFrame {
    private JLabel item1;
    
    public Tuna() {
        super("The title bar");
        setLayout(new FlowLayout());
        
        item1 = new JLabel("this is a sentence");
        item1.setToolTipText("The is going to show up on hover");
        add(item1);
    }
}
