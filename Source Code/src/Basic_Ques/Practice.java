package Basic_Ques;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4};
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        System.out.println(arr.length % end);
    }
}


