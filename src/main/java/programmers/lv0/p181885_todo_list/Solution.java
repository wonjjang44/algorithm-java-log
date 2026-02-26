package programmers.lv0.p181885_todo_list;

import java.util.*;

/**
 * Map 사용
 */
public class Solution {

    public String[] solution(String[] todoList, boolean[] finished) {
        String[] answer = {};

        Map<String, Boolean> map = new LinkedHashMap<>();

        for (int i = 0; i < todoList.length; i++)
            map.put(todoList[i], finished[i]);

        int idx = 0;
        answer = new String[todoList.length];

        for (int i = 0; i < todoList.length; i++) {
            if(!map.get(todoList[i]))
                answer[idx++] = todoList[i];
        }

        return Arrays.copyOf(answer, idx);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false});
        System.out.println("result = " + Arrays.toString(result));
    }
}
