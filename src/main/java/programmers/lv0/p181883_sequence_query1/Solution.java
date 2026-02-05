package programmers.lv0.p181883_sequence_query1;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            for (int j = start; j <= end; j++) arr[j] += 1;
        }

        return arr;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1},{1, 2},{2, 3}});
        System.out.println("result = " + Arrays.toString(result));
    }

}
