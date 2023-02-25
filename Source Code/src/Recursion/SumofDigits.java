package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(Sumd(1342));
    }

    private static int Sumd(int i) {
        if (i == 0) {
            return 0;
        }
        return (i % 10) + Sumd(i / 10);
    }
}
