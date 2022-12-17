package Basic_Ques;

public class Practice {
    public static void main(String[] args) {
            int[] arr = {1};
            int target = 0;
        System.out.println(Search(arr, target));
        }

        static int Search(int[] arr, int target) {
            int pivot = Pivot(arr);

            if (pivot == -1)
                return BinarySearch(arr, target, 0, arr.length - 1);
            if (arr[pivot] == target)
                return pivot;
            if (arr[0] <= target)
                return BinarySearch(arr, target, 0, pivot - 1);

            return BinarySearch(arr, target, pivot + 1, arr.length - 1);
        }

        public static int BinarySearch(int[] arr, int target, int start, int end) {
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

        public static int Pivot(int[] arr) {
            int start = 0; int end = arr.length - 1;
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



