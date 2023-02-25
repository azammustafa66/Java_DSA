package Recursion;

public class Count_0s {
    public static void main(String[] args) {
        System.out.println(count0(300200, 0));
    }

    private static int count0(int n, int count) {
        if (n == 0)
            return count;
        int digit = n % 10;

        if (digit == 0) {
            return count0(n / 10, count + 1);
        }

        return count0(n / 10, count);
    }
}
