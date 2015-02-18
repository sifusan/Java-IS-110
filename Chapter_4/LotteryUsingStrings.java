import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {
        
        String lottery = "" + (int)(Math.random() * 10) +
            (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter you lottery pick (two numbers): ");
        String guess = input.nextLine();
        
        if (guess.length() != 2)
            System.out.println("You must pick exactly two numbers");
            System.exit(1);
        
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);
        
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);
        
        
        if (guess.equals(lottery)) 
            System.out.println("Exact match: You win 10.000$");
            
            
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: You win 3.000$");

        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)

            System.out.println("Match one digit: You win 3.000$");

        else 
            System.out.println("Sorry, no match");
        
        System.out.println(lottery);    
    }
}
