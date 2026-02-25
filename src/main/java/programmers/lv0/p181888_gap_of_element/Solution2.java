package programmers.lv0.p181888_gap_of_element;

import java.util.Arrays;

/**
 * 배열 길이 초기화 후 리턴하는 방식
 */
public class Solution2 {

    public int[] solution(int[] numList, int n) {
        int[] answer = new int[numList.length / n + (numList.length % n == 0 ? 0 : 1)];

        int idx = 0;

        for (int i = 0; i < numList.length; i += n)
            answer[idx++] = numList[i];

        return answer;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] result = solution.solution(new int[]{4, 2, 6, 1, 7, 6}, 2);
        System.out.println("result = " + Arrays.toString(result));
    }

}
