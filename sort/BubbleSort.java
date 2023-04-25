import java.util.*;

/** バブルソート */
public class BubbleSort {
    
    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i ; j--) {
                if (array[j] < array[j - 1]) {
                    int big = array[j - 1];
                    int small = array[j];
                    array[j] = big;
                    array[j - 1] = small;
                }
            }
        }
        
        return array;
    }
}

