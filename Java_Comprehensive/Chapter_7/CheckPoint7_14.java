public class CheckPoint7_14 {
    public static void main(String[] args) {
        
        int[] myList = {1, 2, 3};
        for (int i: myList) {
            System.out.println(i);
        }
        
        myList = new int[10];
        for (int i: myList) {
            System.out.println(i);
        }
        System.out.println("Old list has an index of" + myList.length + "\n");
        
        myList = new int[20];
        System.out.println("New list has an index of" + myList.length + "\n");
    }
}
