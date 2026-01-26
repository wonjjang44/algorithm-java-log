package programmers.lv1.p42748_k_number;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int first = commands[i][0];
            int second = commands[i][1];
            int third = commands[i][2];

            int[] newArr = new int[second - first + 1];

            System.arraycopy(array, first - 1, newArr, 0, second - first + 1);
            Arrays.sort(newArr);

            answer[i] = newArr[third - 1];
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println("result = " + Arrays.toString(result));
    }

}
