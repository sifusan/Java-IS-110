public class CheckPoint11_29 {
    public static void main(String[] args) {
        Object circle1 = new Circle11_29();
        Object circle2 = new Circle11_29();
        System.out.println(circle1.equals(circle2));
    }
}

class Circle11_29 {
    double radius;
    
    public boolean equals(Object circle) {
        return this.radius == 
            ((Circle11_29)circle).radius;
    }
}
