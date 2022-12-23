package Basic_Ques;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(MaxCash(nums));
    }

    private static int MaxCash(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j = j + 2) {
                ans = nums[i] + nums[j];
            }
        }
        return ans;
    }
}