package Patterns;

/*
             *
            **
           ***
          ****
         *****
 */
public class Pattern5 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 0; row < n; row++) {
            int noOfSpaces = n - row + 1;
            for (int s = noOfSpaces; s > 0 ; s--) {
                System.out.print (" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
