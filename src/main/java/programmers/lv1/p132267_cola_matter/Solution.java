package programmers.lv1.p132267_cola_matter;

public class Solution {

    /**
     *
     * @param a 마트에 바칠 빈 병 개수
     * @param b 마트에서 리턴해줄 콜라 개수
     * @param n 총 빈 병 개수
     *
     * @return 마트에서 받을 수 있는 총 누적 콜라 개수
     */
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a) {
            int sum = (n / a) * b; // 받을 콜라 개수
            int remainder = n % a; // 교환 후 남은 빈 병 개수

            answer += sum; // 받은 콜라 개수 누적
            n =  sum + remainder; // 다음 빈 병 수
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(2, 1, 20);
        System.out.println("result = " + result);
    }

}
