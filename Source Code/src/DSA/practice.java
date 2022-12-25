package DSA;

public class practice {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(Solution(arr));
        }
        public static int Solution ( int[] nums){
            for (int i = 0; i < nums.length; i++) {
                int last = nums.length - i - 1;
                int MaxIndex = GetMax(nums, 0, last);
                Swap(nums, MaxIndex, last);
            }
            return nums[nums.length / 2];
        }

        public static int GetMax ( int[] arr, int first, int last){
            int max = first;
            for (int i = 0; i <= last; i++) {
                if (arr[max] < arr[i]) {
                    max = i;
                }
            }
            return max;
        }

        public static void Swap ( int[] arr, int first, int last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
    }



