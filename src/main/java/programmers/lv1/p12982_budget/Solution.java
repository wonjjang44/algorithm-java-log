package programmers.lv1.p12982_budget;

import java.util.Arrays;

public class Solution {

    public int solution(int[] d, int budget) {
        // 누적 합계 변수
        int sum = 0;

        // 조건 true 시 1씩 누적할 변수(부서의 개수)
        int department = 0;

        Arrays.sort(d);

        for (int j : d) {
            sum += j;

            if (sum <= budget) department++;
        }

        return department;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println("result = " + result);
    }
}
