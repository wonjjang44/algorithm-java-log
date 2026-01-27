package programmers.lv1.p12940_gcd_lcm;

import java.util.Arrays;

public class Solution3 {

    public int[] solution(int n, int m) {
        int a = n;
        int b = m;

        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return new int[]{a, n / a * m};
    }


    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int[] result = solution.solution(3, 12);
        System.out.println("result = " + Arrays.toString(result));
    }

}
