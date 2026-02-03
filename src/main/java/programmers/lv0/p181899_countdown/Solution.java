package programmers.lv0.p181899_countdown;

import java.util.Arrays;

public class Solution {

    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        for (int i = 0; i < answer.length; i++)
            answer[i] = start_num - i;

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(10, 3);
        System.out.println("result = " + Arrays.toString(result));
    }

}
