import java.util.Scanner;

public class Game {
    private static Location currentLocation;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        startGame();
    }
    
    public static void startGame() {
        Location startingArea = new Courtyard();
        currentLocation = startingArea;
        startingArea.printInfo();
    }
    
    public changeLocation(String direction) {
        if (currentLocation.hasExit(direction)
    }
    
    public Location getCurrenLocation() {
        return currentLocation;          
}


class Location {

    public Location() {
    }
    
    public void printInfo() {
    }
    
    public boolean hasExit() {
        if Game.getCurrentLocation
}

class Courtyard extends Location {
    private String[] exits = {"North", "East"};
    
    public Courtyard() {
    }
    
    @Override
    public void printInfo() {
        System.out.println("You are in a courtyard");
    }
    
}
    
