package Recursion.Basics;

public class Sum1toN {
    public static void main(String[] args) {
        System.out.println(Sum(5));
    }

    private static int Sum(int i) {
        if (i <= 1) {
            return 1;
        }
        return i + Sum(i - 1);
    }
}
