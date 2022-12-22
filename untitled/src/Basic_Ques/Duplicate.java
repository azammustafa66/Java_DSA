package Basic_Ques;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4};
        System.out.println(Find_Duplicate(arr));
    }

    static ArrayList<Integer> Find_Duplicate(int[] arr) {
        int i = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index + 1)
                    ans.add(arr[index]);
            }
        }
        return ans;
    }
}
