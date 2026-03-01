package programmers.lv0.p181870_remove_ad;

import java.util.Arrays;

public class Solution {

    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        int idx = 0;

        for (int i = 0; i < strArr.length; i++) {
            boolean isContains = strArr[i].contains("ad");
            if(!isContains) answer[idx++] = strArr[i];
        }

        return Arrays.copyOf(answer, idx);
    }
    
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"and","notad","abcd"});
        System.out.println("result = " + Arrays.toString(result));
    }
    
}
