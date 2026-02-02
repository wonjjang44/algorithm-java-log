package programmers.lv1.p12915_str_random_sort;

import java.util.*;

public class Solution {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        // 잘못된 접근
        Map<Character, String> map = new LinkedHashMap<>();
        for (String string : strings)
            map.put(string.charAt(n), string);

        List<Character> charList = new ArrayList<>(map.keySet());

        Collections.sort(charList);

        answer = new String[strings.length];
        int idx = 0;

        for (Character key : charList)
            answer[idx++] = map.get(key);


        return strings;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"sun", "bed", "car"}, 1);
//        String[] result = solution.solution(new String[]{"abcd", "abce", "cdx"}, 1);
        System.out.println("result = " + Arrays.toString(result));
    }

}
