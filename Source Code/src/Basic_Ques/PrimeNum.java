package Basic_Ques;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            if (i == 2) {
                System.out.print(i + " ");
            }
            if (((i % 2) != 0) && (i % i == 0)) {
                System.out.print(i+" ");
            }
        }
    }
}
