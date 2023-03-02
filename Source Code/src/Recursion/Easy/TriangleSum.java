package Recursion.Easy;

import java.util.Arrays;

public class TriangleSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printSum(arr);
    }

    static void printSum(int[] arr) {
        if (arr.length == 1)
            return;

        int[] temp = new int[arr.length - 1];

        helper(arr, temp, 0);

        printSum(temp);

        System.out.println(Arrays.toString(temp));
    }

    static int[] helper(int[] arr, int[] temp, int index) {
        if (index == arr.length - 1)
            return temp;

        temp[index] = arr[index] + arr[index + 1];

        return helper(arr, temp, ++index);
    }
}
