import java.util.Scanner;

public class Game {
    private static boolean playerTurn;
    private static boolean finished;
    private static int numberOfTurns = 1;
    
    public static void main(String[] args) {
    
    System.out.println("Welcome to three in a row!");
    System.out.println("Below is your board");
    Board board = new Board();
    
    System.out.println("Type 'help' for instructions on how to play");
    Scanner input = new Scanner(System.in);
    Player player1 = new Player();
    Player player2 = new Player();
    
    while(!finished) {
        while (!playerTurn) {
            System.out.println("Player 1 turn, turn number " + numberOfTurns);
            System.out.println("Select which column and row you want to check");
            int setX = input.nextInt();
            int setY = input.nextInt();
            board.setPlayer1Check(setX, setY);
            numberOfTurns++;
            playerTurn = true;
            
            
            }
        while (playerTurn) {
            System.out.println("Player 2 turn, turn number " + numberOfTurns);
            System.out.println("Select which column and row you want to check");
            int setX = input.nextInt();
            int setY = input.nextInt();
            board.setPlayer2Check(setX, setY);
            numberOfTurns++;
            if (numberOfTurns > 9) {
                finished = true;
                }
            playerTurn = false;
            }
        }
    }
}


class Board {
    
    private static final int[][] gameBoard = new int[3][3];;
    
    public Board() {
        //int[][] newBoard = makeBoard(gameBoard);
        drawBoard(gameBoard);
        
    }
    
    public static void drawBoard(int[][] grid) {
        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid.length; c++)
                System.out.print(grid[r][c] + " ");
            System.out.println();
        }
    }
    
     public static void setPlayer1Check(int param1, int param2) {
        param1 = param1 - 1;
        param2 = param2 - 1;
        gameBoard[param1][param2] = 1;
        drawBoard(gameBoard);
        //System.out.println("test setX"); 
    }
    
    public static void setPlayer2Check(int param1, int param2) {
        param1 = param1 - 1;
        param2 = param2 - 1;
        gameBoard[param1][param2] = 2;
        drawBoard(gameBoard);
        //System.out.println("test setY");
    }
}


class Player {
    
    public Player() {
        
        Scanner input = new Scanner(System.in);
        //String chooseCharacter = input.nextLine();
        //chooseCharacter.toUpperCase();
        
    }   
}    
