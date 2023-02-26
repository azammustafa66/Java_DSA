package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 18, 9, 15, 10, 15};
        // System.out.println(search(arr, 0, 2));
        System.out.println(searchIndex(arr, 0, 15, list));
    }

    private static boolean search(int[] arr, int index, int target) {
        if (index > arr.length - 1)
            return false;

// if (arr[index] == target)
//     return true;
//
// return search(arr, ++index, target);

        return target == arr[index] || search(arr, ++index, target);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> searchIndex(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length)
            return list;

        if (arr[index] == target)
            list.add(index);

        return searchIndex(arr, ++index, target, list);
    }

}
