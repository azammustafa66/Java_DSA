package Math;

import java.util.Arrays;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 4, 3, 1, 2};
        Arrays.sort(arr);
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int unique = 0;
        for (int n: arr) {
            unique ^= n;
        }
        return unique;
    }
}
