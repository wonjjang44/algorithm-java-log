package programmers.lv1.p12915_str_random_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 인덱스 n에 해당하는 문자를 기존 문자열 앞에 붙여서 솔팅한 후 substring으로 잘라내어 리턴하는 방법
 */
public class Solution3 {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++)
            list.add(strings[i].charAt(n) + strings[i]);

        Collections.sort(list);

        answer = new String[list.size()];

        for (int i = 0; i < answer.length; i++)
            answer[i] = list.get(i).substring(1);

        return answer;
    }


    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        String[] result = solution.solution(new String[]{"sun", "bed", "car"}, 1);
//        String[] result = solution.solution(new String[]{"abcd", "abce", "cdx"}, 2);
        System.out.println("result = " + Arrays.toString(result));
    }

}
