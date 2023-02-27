package Recursion.Basics;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(Productd(1342));
    }

    private static int Productd(int n) {
        if (n == 0) {
            return 1;
        }
        return (n % 10) * Productd(n / 10);
    }
}
