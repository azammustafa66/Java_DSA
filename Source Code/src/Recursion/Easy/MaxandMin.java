package Recursion.Easy;

public class MaxandMin {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(Findmin(arr, arr.length));
        System.out.println(Findmax(arr, arr.length));
    }

    public static int Findmin(int[] arr, int size) {
        if (size == 1)
            return arr[0];

        return Math.min(arr[size - 1], Findmin(arr, size - 1));
    }

    public static int Findmax(int[] arr, int size) {
        if (size == 1)
            return arr[0];

        return Math.max(arr[size - 1], Findmax(arr, size - 1));
    }
}
