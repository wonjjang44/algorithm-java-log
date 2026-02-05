package programmers.lv0.p181893_array_slice;

import java.util.Arrays;

/**
 * 짝수/홀수 조건에 따라 배열 자체를 변경하는 방법
 */
public class Solution {

    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            System.out.println("실시간 변화하는 arr 배열 -> Arrays.toString(arr) = " + Arrays.toString(arr));
            // 짝수 일 때, 뒷부분 자르기
            if (i % 2 == 0) arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            // 홀수 일 때, 앞부분 자르기
            else arr = Arrays.copyOfRange(arr, query[i], arr.length);
        }

        return arr;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2});
//        int[] result = solution.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{1, 4, 2}); // 반례
        System.out.println("result = " + Arrays.toString(result));
    }

}
