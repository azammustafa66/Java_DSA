package Recursion;

public class _1toN {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        print(n - 1);
        System.out.print(n+" ");
    }
}
