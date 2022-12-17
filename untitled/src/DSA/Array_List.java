package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        /*
                        Syntax
            ArrayList<integer> name = new ArrayList<>();
         */
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        System.out.print(list+" ");
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//        System.out.println(list.get(1)); // Can't use [0] here to get a specific element
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }

}
