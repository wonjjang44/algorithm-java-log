package programmers.lv1.p12932_num_revers_to_array;

import java.util.Arrays;

/**
 * for 조건 사용
 */
public class Solution2 {

    public int[] solution(int num) {
        int[] answer = {};
        int idx = 0;

        String[] strArr = String.valueOf(num).split("");
        answer = new int[strArr.length];

        for (int i = strArr.length - 1; i >= 0; i--) {
            answer[idx++] = Integer.parseInt(strArr[i]);
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] result = solution.solution(12345);
        System.out.println("result = " + Arrays.toString(result));
    }

}
