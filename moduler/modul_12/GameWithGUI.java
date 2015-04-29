import java.util.ArrayList;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JFrame;
//import javax.swing.JTextField;
//import javax.swing.JOptionPane;
//import javax.swing.JLabel;
//import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.*;

public class GameWithGUI {
    private static ArrayList<Area> areas = new ArrayList<Area>();
    public static void main(String[] args) {
        fillAreas(areas);
        
        Person person = new Person(10, areas.get(0));
        
        GameWindow gameWindow = new GameWindow();
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setSize(300, 250);
        gameWindow.setVisible(true);
        
     }
     
     public static Area getArea(int i) {
        return areas.get(i);
    }
     
     public static void fillAreas(ArrayList<Area> areas) {
        areas.add(new Room1("Room 1", true));
        areas.add(new Room2("Room 2", false));
     }
}

class Person {
    private static int health;
    private static Area area;
    
    public Person(int health, Area area) {
        setHealth(health);
        setArea(area);
    }
    
    public static int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public static Area getCurrentArea() {
        return area;
    }
    
    public static void setArea(Area newArea) {
        area = newArea;
    }
    
    public String toString() {
        return area.toString();
    }
}

class Area {
    private String name;
    private static boolean safe;
    
    public Area(String name, boolean safe) {
        this.name = name;
        this.safe = safe;
    }
    
    public String getName() {
        return name;
    }
    
    public static boolean getSafe() {
        return safe;
    }
    
    public static String isSafe() {
        if(!getSafe()) {
            return "The room is safe";
        }
        else {
            return "The room is not safe";
        }
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSafe(boolean safe) {
        this.safe = safe;
    }
    
    @Override
    public String toString() {
        return "This is " + name;
    }
}

class Room1 extends Area {  
    public Room1(String name, boolean safe) {
        super(name, safe);
    }
}

class Room2 extends Area {
    public Room2(String name, boolean safe) {
        super(name, safe);
    }
}

class GameWindow extends JFrame {
    private JLabel currentArea;
    private JLabel health;
    private JLabel safe;
    private JButton area1;
    private JButton area2;
    String parsedHealth;
    String labelArea;
    
    public GameWindow() {
        super("Game Window");
        setLayout(new FlowLayout());
        Border border = LineBorder.createGrayLineBorder();
        labelArea = Person.getCurrentArea().toString();
        currentArea = new JLabel(labelArea, SwingConstants.CENTER);
        currentArea.setBorder(border);
        add(currentArea);
        
        parsedHealth = String.valueOf("Your health is: " + Person.getHealth());
        health = new JLabel(parsedHealth, SwingConstants.CENTER);
        health.setBorder(border);
        health.setHorizontalTextPosition(JLabel.LEFT);
        health.setVerticalTextPosition(JLabel.TOP);
        add(health);
        
        safe = new JLabel(Area.isSafe(), SwingConstants.CENTER);
        safe.setBorder(border);
        add(safe);
        
        area1 = new JButton("Room 1");
        add(area1);
        
        area2 = new JButton("Room 2");
        add(area2);
        
        EventHandler eventHandler = new EventHandler();
        area1.addActionListener(eventHandler);
        area2.addActionListener(eventHandler);
    }
    
    private class EventHandler implements ActionListener {
         public void actionPerformed(ActionEvent event) {
            String string = "";
            
            if(event.getSource() == area1) {
                Person.setArea(GameWithGUI.getArea(0));
                currentArea.setText(GameWithGUI.getArea(0).toString());
                string = Person.getCurrentArea().toString();
                
                
            }
            else if(event.getSource() == area2) {
                Person.setArea(GameWithGUI.getArea(1));
                currentArea.setText(GameWithGUI.getArea(1).toString());
                string = Person.getCurrentArea().toString();
            }
            JOptionPane.showMessageDialog(null, string);
        }
    }
}
