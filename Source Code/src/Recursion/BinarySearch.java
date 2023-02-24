package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarysearch(arr, 15, 0, arr.length - 1));
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarysearch(arr, target, 0, mid - 1);
        } else {
            return binarysearch(arr, target, mid + 1, end);
        }
    }
}
