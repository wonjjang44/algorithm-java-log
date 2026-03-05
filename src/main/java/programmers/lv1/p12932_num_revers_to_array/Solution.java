package programmers.lv1.p12932_num_revers_to_array;

import java.util.Arrays;

/**
 * StringBuilder의 reverse() 메서드 사용
 */
public class Solution {

    public int[] solution(long n) {
        int[] answer = {};
        StringBuilder sb = new StringBuilder();

        String[] strArr = String.valueOf(n).split("");

        for (String s : strArr)
            sb.append(Integer.parseInt(s));

        StringBuilder reverseNum = sb.reverse();
        String[] charArr = reverseNum.toString().split("");
        answer = new int[charArr.length];

        for (int i = 0; i < charArr.length; i++)
            answer[i] = Integer.parseInt(charArr[i]);

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] result = solution.solution(12345);
        int[] result = solution.solution(1258129125);
        System.out.println("result = " + Arrays.toString(result));
    }
}
