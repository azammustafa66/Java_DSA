package Basic_Ques;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1, c;

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
