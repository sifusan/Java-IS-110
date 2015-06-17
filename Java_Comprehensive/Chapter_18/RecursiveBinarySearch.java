
public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }
    
    private static int recursiveBinarySearch(int[] list, int key, int low, 
            int high) {
        if (low > high)
            return low - 1;
        
        int mid = (low + high) / 2;
        if (key < list[mid])
            return recursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return recursiveBinarySearch(list, key, mid + 1, high);
    }
    
    public static void main(String[] args) {
        int list[] = {1, 3, 4, 22, 34, 56};
        int key = 22;
        System.out.println(recursiveBinarySearch(list, key));
    }
}
