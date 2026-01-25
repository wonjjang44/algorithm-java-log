package programmers.lv1.p12935_remove_min_num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int[] arr) {
        int[] answer = {};

        // int 자료형의 최댓값(21억~~)
        int min = Integer.MAX_VALUE;

        for (int j : arr)
            min = Math.min(min, j);

        List<Integer> list = new ArrayList<>();

        for (int j : arr) {
            list.add(j);

            if (j == min) list.remove(Integer.valueOf(j));
        }

        if(list.isEmpty()) list.add(-1);

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);


        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] result = solution.solution(new int[]{4, 3, 2, 1});
        int[] result = solution.solution(new int[]{10});
        System.out.println("result = " + Arrays.toString(result));
    }

}
