package programmers.lv0.p181920_count;

import java.util.Arrays;

public class Solution {

    public int[] solution(int start_num, int end_num) {
        int[] answer;

        int length = end_num - start_num + 1;
        answer = new int[length];

        for (int i = 0; i < answer.length; i++)
            answer[i] = start_num + i;

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(3, 10);
        System.out.println("result = " + Arrays.toString(result));
    }

}
