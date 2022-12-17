package Basic_Ques;

public class peakinmountainarray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 5, 4, 3};
        System.out.println(PeakElement(nums));
    }

    static int PeakElement(int[] nums) {
        int start = 0; int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return nums[end];
    }
}
