package Basic_Ques;

import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        max(arr);
    }

    static void max (int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
    }
}
