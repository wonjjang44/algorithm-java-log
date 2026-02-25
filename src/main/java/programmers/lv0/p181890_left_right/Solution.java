package programmers.lv0.p181890_left_right;

import java.util.Arrays;

/**
 * Arrays.copyOf()
 */
public class Solution {

    public String[] solution(String[] strList) {
        String[] answer = new String[strList.length];

        int idx = 0;

        for (int i = 0; i < strList.length; i++) {
            if("l".equals(strList[i])) {
                for (int j = 0; j < i; j++) {
                    answer[idx] = strList[j];
                    idx++;
                }

                return Arrays.copyOf(answer, idx);
            } else if("r".equals(strList[i])) {
                for (int j = i + 1; j < strList.length; j++) {
                    answer[idx] = strList[j];
                    idx++;
                }

                return Arrays.copyOf(answer, idx);
            }

        }

        return Arrays.copyOf(answer, idx);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"u", "u", "l", "r"});
//        String[] result = solution.solution(new String[]{"l"});
//        String[] result = solution.solution(new String[]{"u", "d", "l", "r"});
//        String[] result = solution.solution(new String[]{"u", "u", "r", "l"});
        System.out.println("result = " + Arrays.toString(result));
    }

}
