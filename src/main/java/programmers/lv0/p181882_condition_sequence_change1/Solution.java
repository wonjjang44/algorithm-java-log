package programmers.lv0.p181882_condition_sequence_change1;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
            else if(arr[i] < 50 && arr[i] % 2 != 0) arr[i] *= 2;
        }

        return arr;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 2, 3, 100, 99, 98});
        System.out.println("result = " + Arrays.toString(result));
    }

}
