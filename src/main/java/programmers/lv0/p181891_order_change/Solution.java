package programmers.lv0.p181891_order_change;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        // 이후 원소는 n 포함
        // 이전 원소는 n 미포함

        // 이후 원소 배열
        // int[] afterArr = new int[num_list.length - n];
        List<Integer> afterArr = new ArrayList<>();
        // 이전 원소 배열
        // int[] beforeArr = new int[num_list.length - afterArr.length];
        List<Integer> beforeArr =  new ArrayList<>();

        // 이전
//        for (int i = 0; i < n; i++) {
//            answer[num_list.length - 1] = num_list[n - i - 1];
//        }

        // 이전
        for (int i = n; i > 0; i--) {
            answer[num_list.length - i] = num_list[Math.abs(i - n)];
        }

        // 이후
        for (int i = 0; i < num_list.length - n; i++) {
            answer[i] = num_list[n + i];
        }

        return answer;


        // 다른 풀이
//        int[] copy = Arrays.copyOf(numList, numList.length * 2);
//
//        System.arraycopy(numList, 0, copy, numList.length, numList.length);
//        return Arrays.copyOfRange(copy, n, n + numList.length);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{2, 1, 6}, 1);
//        int[] result = solution.solution(new int[]{5, 2, 1, 7, 5}, 3);
        System.out.println("result = " + Arrays.toString(result));
    }

}
