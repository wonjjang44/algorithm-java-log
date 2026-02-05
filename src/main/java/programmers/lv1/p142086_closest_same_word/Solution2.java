package programmers.lv1.p142086_closest_same_word;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Map을 이용한 방법
 */
public class Solution2 {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                answer[i] = i-map.get(c);
            }else{
                answer[i] = -1;
            }
            map.put(c, i);
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] result = solution.solution("banana");
//        int[] result = solution.solution("foobar");
        System.out.println("result = " + Arrays.toString(result));
    }

}
