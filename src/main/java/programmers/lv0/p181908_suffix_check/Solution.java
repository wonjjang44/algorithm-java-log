package programmers.lv0.p181908_suffix_check;

import java.util.Arrays;

public class Solution {

    public int solution(String my_string, String is_suffix) {
        int result = 0;
        int length = my_string.length();

        String[] suffixStrArr = new String[length];

        for (int i = 0; i < length; i++)
            suffixStrArr[i] = my_string.substring(i, length);

        for (String s : suffixStrArr)
            if (s.equals(is_suffix)) return 1;

        // 다른 방법 : 배열을 리스트로 변경 후 contains 메서드 활용하기
        // boolean flag = Arrays.asList(suffixStrArr).contains(is_suffix);

        return result;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("banana", "ana");
        System.out.println("result = " + result);
    }
}
