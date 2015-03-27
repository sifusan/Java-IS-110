public class CheckPoint10_8 {
    public static void main(String[] args) {
        
        Integer i = new Integer("23");
        System.out.println(i);
        
        Integer j = new Integer(23);
        System.out.println(j);
        
        Integer a = Integer.valueOf("23");
        System.out.println(a);
        
        Integer b = Integer.parseInt("23", 8);
        System.out.println(b);
        
        //Double d = new Double();
        int c = (Integer.valueOf("23")).intValue();
        System.out.println(c);
        
        double d = (Double.valueOf("23.4")).doubleValue();
        System.out.println(d);
        
        int x = (Double.valueOf("23.4")).intValue();
        System.out.println(x);
        
        String s = (Double.valueOf("23.4")).toString();
        System.out.println(s);
    }
}
