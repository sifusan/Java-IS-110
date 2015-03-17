public class TestPassObject {
    
    public static void main(String[] args) {
        
        CircleWithPrivateFields myCircle = 
            new CircleWithPrivateFields(1);

        int n = 5;
        printAreas(myCircle, n);
    
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }
    
    public static void printAreas (
            CircleWithPrivateFields c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
