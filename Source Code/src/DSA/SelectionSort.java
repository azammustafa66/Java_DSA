package DSA;

import java.util.Arrays;


public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 2};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int MaxIndex = getMaxIndex(arr, 0, last);
            swap(arr, MaxIndex, last);
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
