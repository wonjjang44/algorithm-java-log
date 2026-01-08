package programmers.lv0.p181909_suffix_array;

import java.util.Arrays;

public class Solution {

    public String[] solution(String my_string) {
        int length = my_string.length();

        String[] suffixStrArr = new String[length];
        for (int i = 0; i < length; i++)
            suffixStrArr[i] = my_string.substring(i, length);

        Arrays.sort(suffixStrArr);

        return suffixStrArr;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution("programmers");
        System.out.println("result = " + Arrays.toString(result));
    }
}
