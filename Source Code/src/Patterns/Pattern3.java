package Patterns;

/*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
 */
public class Pattern3 {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 1; col <= row + 1 ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
