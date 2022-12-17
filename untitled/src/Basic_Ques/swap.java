package Basic_Ques;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before swapping "+Arrays.toString(arr));
        change(arr,0,4);
        System.out.println("After swapping"+Arrays.toString(arr));
    }

    static int[] change(int[] arr, int index1, int index2) {
        int temp = arr [index2];
            arr[index2] = arr[index1];
            arr[index1] = temp;
        return arr;
    }

}

