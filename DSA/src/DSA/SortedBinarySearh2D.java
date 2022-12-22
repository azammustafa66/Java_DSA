package DSA;

import java.util.Arrays;

public class SortedBinarySearh2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(Search(arr, 2)));
    }

    private static int[] Search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            int mid = r + (c - r) / 2;
            if (arr[r][mid] == target)
                return new int[] {r, mid};
        }
        return new int[] {-1, -1};
    }
}
