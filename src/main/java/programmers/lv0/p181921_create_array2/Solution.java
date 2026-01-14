package programmers.lv0.p181921_create_array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);

            boolean flag = true;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if(c != '0' && c != '5') {
                    flag = false;

                    break;
                }
            }

            if(flag) result.add(i);
        }

        if(result.isEmpty()) return new int[]{-1};

        answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = result.get(i);

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(5, 555);
        System.out.println("result = " + Arrays.toString(result));
    }
}
