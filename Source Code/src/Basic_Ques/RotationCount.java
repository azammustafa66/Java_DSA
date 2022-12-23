package Basic_Ques;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int pivot = findPivot(arr);
        int old = pivot;
        pivot++;
        if (pivot == arr.length - 1)
            System.out.println(old);
        else
            System.out.println(pivot);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                return mid;
            if (arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[start] > arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
       return -1;
    }
}
