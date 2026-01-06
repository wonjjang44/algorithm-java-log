package programmers.lv0.p181919_collatz_guess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 배열만 사용하여 풀어볼 것
 */
public class Solution {

    public int[] solution(int n) {
        int[] answer = {};

        List<Integer> answerList = new ArrayList<>();
        // 초기값 세팅
        answerList.add(n);

        while (n > 1) {
            if(n % 2 == 0) {
                n = n / 2;
                answerList.add(n);
            } else {
                n = (3 * n) + 1;
                answerList.add(n);
            }

        }

        answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = answerList.get(i);

        return answer;
    }



    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(10);
        System.out.println("result = " + Arrays.toString(result));
    }

}
