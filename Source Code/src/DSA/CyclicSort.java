package DSA;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        Cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap (int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
