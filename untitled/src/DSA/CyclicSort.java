package DSA;

import java.util.ArrayList;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Cycle(arr));
    }

    static List<Integer> Cycle(int[] arr) {
        int i = 0;
        ArrayList<Integer> ans = null;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
            ans = new ArrayList<>();
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index + 1) {
                    ans.add(arr[index]);
                    ans.add(arr[index] + 1);
                }
            }
        }
        return ans;
    }
}
