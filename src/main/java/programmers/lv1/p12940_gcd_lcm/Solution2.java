package programmers.lv1.p12940_gcd_lcm;

import java.util.Arrays;

/**
 * 유클리드 호제법 사용
 */
public class Solution2 {

    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        // n과 m을 먼저 곱하면 int의 최대 값인 21억 ~~을 넘을 수 있기 때문에 안전하게 n을 최대공약수로 나눈 다음 곱한다.
        int lcm = n / gcd * m;

        return new int[]{gcd, lcm};
    }


    private int gcd(int a, int b) {
        if(b == 0) return a;

        return gcd(b, a % b);
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] result = solution.solution(2, 5);
        System.out.println("result = " + Arrays.toString(result));
    }

}
