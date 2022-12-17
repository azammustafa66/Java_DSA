package Basic_Ques;

public class infinitearray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 17, 25, 27, 43, 56, 85, 100, 130, 140, 160, 170};
        int target = 56;
        System.out.println(Indexes(arr, target));
    }

    static int Indexes(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) { // this loop will break when target < arr[end] then it will search
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }
    public static int BinarySearch (int[] arr, int target, int start, int end) {
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
