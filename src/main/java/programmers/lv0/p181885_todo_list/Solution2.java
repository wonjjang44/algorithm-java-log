package programmers.lv0.p181885_todo_list;

import java.util.Arrays;

/**
 * false인 인덱스를 사용하여 todoList의 값을
 * 가져와 콤마(,)가 포함된 문자열로 만들고 이를 split 후 리턴
 */
public class Solution2 {

    public String[] solution(String[] todoList, boolean[] finished) {
        String str = "";

        for (int i = 0; i < finished.length; i++) {
            if(!finished[i]) str += todoList[i] + ",";
        }

        return str.split(",");
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String[] result = solution.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false});
        System.out.println("result = " + Arrays.toString(result));
    }

}
