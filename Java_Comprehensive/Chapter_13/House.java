public class House implements Cloneable, Comparable<House> {
    private int ID;
    private double area;
    private java.util.Date whenBuilt;
    
    public House(int id, double area) {
        this.ID = ID;
        this.area = area;
        whenBuilt = new java.util.Date();
    }
    
    public int getID() {
        return ID;
    }

    public double getArea() {
        return area;
    }
    
    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public int compareTo(House o) {
        if (area > o.area) {
            return 1;
        }
        else if (area < o.area) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
