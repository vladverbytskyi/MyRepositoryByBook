package SecondHW;

import java.util.Arrays;

public class DuplicateValues {
    public static void main(String[] args) {
        Integer[] integers = {3, 2, 3, 1, 4, 2, 8, 3};

        for (int i = 0; i < integers.length; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[i].equals(integers[j])) {
                    integers[j] = 0;
                }
            }
            System.out.println(integers[i]);
        }

    }
}
