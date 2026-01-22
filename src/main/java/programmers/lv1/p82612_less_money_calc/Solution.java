package programmers.lv1.p82612_less_money_calc;

public class Solution {

    public long solution(int price, int money, int count) {
        long answer = -1;
        long result;
        long sum = 0;

        for (int i = 1; i <= count; i++)
            sum += i;

        result = price * sum;
        answer = money - result > 0 ? 0 : Math.abs(money - result);

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        long result = solution.solution(3, 20, 4);
        long result = solution.solution(2500, 1000000000, 2500);
        System.out.println("result = " + result);
    }

}
