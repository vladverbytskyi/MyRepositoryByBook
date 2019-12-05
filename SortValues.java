package SecondHW;

import java.util.Arrays;
import java.util.Collections;

public class SortValues {
    public static void main(String[] args) {
        Integer[] array = {2, 5, 7, 8, 3, 0};
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
