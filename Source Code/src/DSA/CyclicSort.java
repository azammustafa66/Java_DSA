package DSA;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 4, 2, 3};
        Cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
