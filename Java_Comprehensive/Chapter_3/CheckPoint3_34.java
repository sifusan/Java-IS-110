import java.util.Scanner;

public class CheckPoint3_34 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age >");
        int ages = input.nextInt();
        
        System.out.println((ages >= 16) ? "Age is 16 or higher" : "Age is 15 or lower");

    }
}
