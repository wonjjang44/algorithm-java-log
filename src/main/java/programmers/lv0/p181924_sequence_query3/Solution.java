package programmers.lv0.p181924_sequence_query3;

import java.util.Arrays;

/**
 * 다시 풀어야 함(도움 받음)
 */
public class Solution {

    public int[] solution(int[] arr, int[][] queries) {

//        for (int[] query : queries) {
//            for (int i = 0; i < query.length; i++) {
//                int temp = query[i];
//                query[i] = query[query.length - 1 - i];
//                query[query.length - 1 - i] = temp;
//
//                arr[query.length - 1 - i] = query[i];
//
//                System.out.println("arr = " + Arrays.toString(arr));
//            }
//        }

        for (int i = 0; i < queries.length; i++) {
            int k = queries[i][0];
            int l = queries[i][1];

            System.out.println("k = " + k);
            System.out.println("l = " + l);

            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
        }
        
        return arr;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}});
        System.out.println(Arrays.toString(result));
    }
}
