package DSA;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr; // Array defined in stack
//        arr = new int[5]; // Array created in heap memory (stored)
//        String[] str = new String[5]; //Null is a literal can be only assigned to non primitives
//        System.out.println(arr[0]);
//        System.out.println(str[0]);

        // Input for arrays
//        for (int i = 0; i < 5; i++) {
//            arr [i] = in.nextInt();
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i]+" "); // Easy way to print is using Arrays.toString
//        }
//        // Alternatively you can use enhanced for loop
//        for(int j : arr)
//            System.out.print(j+" "); // Here j represents each element of array

                    // Multidimensional Arrays
                    /*
                         2 3 4
                         5 6 7
                         8 9 10
                     */
         int[][] arr = new int[3][3];
//         int[][] marr = {
//                {2, 3, 4},
//                {5, 6, 7},
//                {8, 9, 10}
//        };
        //System.out.println(marr.length); // Gives length of only rows.
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int[] a : arr) {
            System.out.println(java.util.Arrays.toString(a));
        }
    }
}
