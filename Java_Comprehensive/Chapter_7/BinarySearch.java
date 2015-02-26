public class BinarySearch {

    public static void main(String[] args) {
    int[] list = {1, 3, 5, 6, 7, 8, 9, 22, 56, 60, 67, 100};
    int r = (int)(Math.random() * 100);
    int b = binarySearch(list, r);
    System.out.println("The index of " + r + " is " + "" + b);
    }
    
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length -1;
        
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        
        return -low - 1;
    }
}
            
