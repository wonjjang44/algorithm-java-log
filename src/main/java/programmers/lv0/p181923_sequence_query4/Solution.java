package programmers.lv0.p181923_sequence_query4;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int s =  queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++)
                if(j % k == 0) arr[j] += 1;
        }

        return arr;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}});
        System.out.println("result = " + Arrays.toString(result));
    }

}
