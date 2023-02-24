package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fib(5));
    }

    static int Fib(int n) {
        if (n <= 1) {
            return n;
        }
        return Fib(n - 2) + Fib(n - 1);
    }
}
