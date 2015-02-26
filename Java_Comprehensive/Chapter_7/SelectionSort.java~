public class SelectionSort {

    public static void main(String[] args) {
        double[] list = {2.0, 1.4, 7.3, 78.0, 4.9};
        selectionSort(list);
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length -1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        
        for (double d: list) {
            System.out.println(d);
        }
    }
}
