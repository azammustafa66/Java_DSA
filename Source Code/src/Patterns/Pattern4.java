package Patterns;
/*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
 */
public class Pattern4 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
