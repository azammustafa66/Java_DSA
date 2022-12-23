package Basic_Ques;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(Missing(arr));
    }

    static List<Integer> Missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index + 1)
                    ans.add(index + 1);
            }
        return ans;
    }
}
