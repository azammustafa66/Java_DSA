package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,15,16,18,20};
        int target = 9;
        System.out.println(BinarySearch(arr,target));
    }

    public static int BinarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}

