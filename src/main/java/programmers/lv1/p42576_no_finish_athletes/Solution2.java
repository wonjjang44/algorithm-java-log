package programmers.lv1.p42576_no_finish_athletes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * HashMap 사용하기
 */
public class Solution2 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        for (String s : participant)
            map.put(s, map.getOrDefault(s, 0) + 1);

        System.out.println("put 완료 map = " + map);

        for (String s : completion) {
            System.out.println("실시간 map 변화 상태 = " + map);
            map.put(s, map.get(s) - 1);
        }

        System.out.println("put 완료 map = " + map);

        for (String k : map.keySet())
            if(map.get(k) != 0) return k;

        return answer;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
//        String result = solution.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
//        String result = solution.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        String result = solution.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println("result = " + result);
    }

}
