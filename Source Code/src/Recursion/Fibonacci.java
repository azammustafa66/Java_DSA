package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fib(10));
    }

    static int Fib(int n) {
        if (n < 2) {
            return n;
        }
        return Fib(n - 2) + Fib(n - 1);
    }
}
