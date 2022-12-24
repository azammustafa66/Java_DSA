package DSA;
import java.util.Arrays;

public class InsertionSort {
    // With each pass array is getting sorted j times
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j])
                    Swap(arr, j - 1, j);
                else
                    break;
            }
        }
    }

    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
