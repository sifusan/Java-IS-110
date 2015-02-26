public class CheckPoint7_15 {
    public static void main(String[] args) {
        
        int[] list = {1, 2, 3, 5, 4};
        
        for (int = 0, j = list.length - 1; i < list.length; i++, j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}
