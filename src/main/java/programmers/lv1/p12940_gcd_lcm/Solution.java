package programmers.lv1.p12940_gcd_lcm;

import java.util.Arrays;

public class Solution {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int gcd = Integer.MIN_VALUE;
        int lcm = 0;

        for (int i = 1; i <= Math.min(n, m); i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = Math.max(gcd, i);
                lcm = (n / i) * (m / i);
            }
        }

        answer[0] = gcd;
        answer[1] = gcd * lcm;

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(2, 5);
        System.out.println("result = " + Arrays.toString(result));
    }

}
