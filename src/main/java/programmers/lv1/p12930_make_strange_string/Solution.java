package programmers.lv1.p12930_make_strange_string;

import java.util.Arrays;

/**
 * 원본 문자열 split으로 쪼개어 배열로 사용
 */
public class Solution {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] words = s.split(" ", -1);
        System.out.println("words = " + Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = 0; j < word.length(); j++) {
                String ch = String.valueOf(word.charAt(j));
                ch = j % 2 == 0 ? ch.toUpperCase() : ch.toLowerCase();

                answer.append(ch);
            }

            // 마지막에 공백을 붙이지 않는다(i < words.length - 1 => 마지막)
            if (i < words.length - 1) answer.append(" ");

        }

        return answer.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        String result = solution.solution("try hello world");
//        String result = solution.solution("AA aa ZZ zz"); // Aa Aa Zz Zz
        String result = solution.solution("  TRy HElLo  WORLD   "); //  TrY HeLlO  WoRlD
        System.out.println("result = " + result);
    }

}
