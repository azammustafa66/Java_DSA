package Recursion;

public class Reverse {
    public static void main(String[] args) {
        reverse1(1342);
        System.out.println(reverse2(1342));
    }

    static void reverse1(int n) {
        if (n == 0)
            return;
        System.out.print(n % 10);
        reverse1(n / 10);
    }

    static int reverse2(int n) {
        int digits = (int)Math.log10(n) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n)
            return n;

        int rem = n % 10;

        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
