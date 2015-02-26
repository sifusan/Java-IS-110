public class LinearSearch {
    public static void main(String[] args) {
        
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4);
        System.out.println(i);
        int j = linearSearch(list, -4);
        System.out.println(j);
        int k = linearSearch(list, -3);
        System.out.println(k);
        int x = linearSearch(list, 7);
        System.out.println(x);
        
        
    }
    
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        
        return -1;
        // return 0; for comprehension/testing
    }
    
}
