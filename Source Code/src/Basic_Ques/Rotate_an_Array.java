package Basic_Ques;

import java.util.Arrays;

public class Rotate_an_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Rotate(arr, 0, arr.length - k - 1);
        Rotate(arr, arr.length - k, arr.length - 1);
        Rotate(arr, 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void Rotate(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
