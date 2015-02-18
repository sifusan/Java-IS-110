
public class CheckPoint3_40 {
    public static void main(String[] args) {
        
        int x = -130956835;
        int y = 3;
        
        boolean var1 = (x > 0 && x < 10);
        boolean var2 = ((x > 0) && (x<10));
        
        System.out.println((var1 == var2) ? "True" : "False");
        System.out.println(var1);
        System.out.println(var2);
        System.out.println("");
        
        boolean var3 = (x > 0 || x < 10);
        boolean var4 = ((x > 0) || (x < 10));
        
        System.out.println((var3 == var4) ? "True" : "False");
        System.out.println(var3);
        System.out.println(var4);
        System.out.println("");

        boolean var5 = (x > 0 || x < 10 && y < 0);
        boolean var6 = (x > 0 && (x < 10 || y < 0));
        
        
        System.out.println((var5 == var6) ? "True" : "False");
        System.out.println(var5);
        System.out.println(var6);
        System.out.println("");
    }
}
