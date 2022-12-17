package Basic_Ques;

public class ceiling {
    public static void main(String[] args) {
        int[] nums = {2, 9, 12, 15, 25, 65};
        int target = 16;
        System.out.println(ceilingofNum(nums, target));
    }

    public static int ceilingofNum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return nums[end];
    }
}
