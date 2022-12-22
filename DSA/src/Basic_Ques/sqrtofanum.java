package Basic_Ques;


public class sqrtofanum {
    public static void main(String[] args) {
        int num[] = new int[50];
        for (int i = 1; i <= 36; i++) {
            num[i] = i;
        }
        int target = 36;
        sqroot(num, target);
    }

    static int sqroot(int[] num, int x) {
        int start = 1; int end = x;
        if (x <= 1)
            return x;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1))
                return mid;
            else if (mid < x / mid)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
