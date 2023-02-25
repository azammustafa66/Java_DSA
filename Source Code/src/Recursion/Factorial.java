package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 5; i > 0; i--) {
            fact *= i;
        }
        System.out.println(fact);
        System.out.println(factorial(5));
    }

    private static int factorial(int i) {
        if (i <= 1)
            return 1;
        return i * factorial(--i);
    }
}
