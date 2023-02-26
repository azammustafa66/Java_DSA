package Recursion.Arrays;

public class Sorted_or_Not {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = {1, 4, 5, 8, 15, 12};

        System.out.println(check(arr, i));
    }

    static boolean check(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
//        if (arr[i] < arr[i + 1]) {
//            return check(arr, ++i);
//        }
//        return false;

        return arr[i] < arr[i + 1] && check(arr, ++i);
    }
}
