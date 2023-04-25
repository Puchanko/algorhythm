import java.util.*;

/** 選択ソート */
public class SelectionSort {
    
    public static int[] selectionSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            int moveIndex = i + 1;
            for (int j = i + 1; j < n - 1; j++) {
                if (array[j + 1] < array[moveIndex]) {
                    moveIndex = j + 1;
                }
            }
            if (array[moveIndex] < array[i]) {
                int minValue = array[moveIndex];
                int moveValue = array[i];
                array[i] = minValue;
                array[moveIndex] = moveValue;
            }
        }
        
        return array;
    }
}

