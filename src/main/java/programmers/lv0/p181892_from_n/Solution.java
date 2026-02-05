package programmers.lv0.p181892_from_n;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] num_list, int n) {
        int[] answer = new  int[num_list.length - n + 1];

        System.arraycopy(num_list, n - 1, answer, 0, answer.length);

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{2, 1, 6}, 3);
//        int[] result = solution.solution(new int[]{5, 2, 1, 7, 5}, 2);
        System.out.println("result = " + Arrays.toString(result));
    }

}
