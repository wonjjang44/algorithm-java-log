package programmers.lv1.p142086_closest_same_word;

import java.util.Arrays;

public class Solution {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        String[] word = s.split("");

        StringBuilder emptyStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!emptyStr.toString().contains(word[i])) {
                answer[i] = -1;
                emptyStr.append(word[i]);
            } else {
                int prevIdx = emptyStr.lastIndexOf(word[i]);
                answer[i] = i - prevIdx;

                emptyStr.append(word[i]);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution("banana");
        System.out.println("result = " + Arrays.toString(result));
    }

}
