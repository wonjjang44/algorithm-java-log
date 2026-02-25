package programmers.lv0.p181890_left_right;

import java.util.Arrays;

/**
 * Arrays.copyOfRange()
 */
public class Solution2 {

    public String[] solution(String[] strList) {
        for (int i = 0; i < strList.length; i++) {
            if("l".equals(strList[i])) return Arrays.copyOfRange(strList, 0, i);
            else if("r".equals(strList[i])) return Arrays.copyOfRange(strList, i + 1, strList.length);
        }

        return new String[]{};
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
//        String[] result = solution.solution(new String[]{"u", "u", "l", "r"});
        String[] result = solution.solution(new String[]{"r", "u"});
//        String[] result = solution.solution(new String[]{"l"});
        System.out.println("result = " + Arrays.toString(result));
    }

}
