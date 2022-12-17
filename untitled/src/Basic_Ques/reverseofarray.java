package Basic_Ques;

import java.util.Arrays;

import static Basic_Ques.swap.change;

public class reverseofarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            change(arr,start,end);
            start++;
            end--;
        }
    }
}
