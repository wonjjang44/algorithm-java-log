package programmers.lv0.p181923_sequence_query2;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = 1_000_000;

            for (int j = 0; j < arr.length; j++) {
                if((s <= j && j <= e) && k < arr[j]) {
                    if(arr[j] < min) min = arr[j];
                }
            }

            answer[i] = (min == 1_000_000 ? -1 : min);
        }

        return answer;
    }




    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}});
        System.out.println("result = " + Arrays.toString(result));
    }

}
