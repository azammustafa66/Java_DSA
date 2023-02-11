package Patterns;

public class Pattern28 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n; row++) {
            int rowsincol = row > n ? 2 * n - row : row;
            int spaces = n - rowsincol;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < rowsincol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
