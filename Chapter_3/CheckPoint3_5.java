import java.util.Scanner;

public class CheckPoint3_5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number for score");
        
        int score = input.nextInt();
        
        double pay = 967;
        
        if (score > 90) {
            pay = (int)(pay * 1.03);
        }
        
        System.out.println(pay);
    }
}
