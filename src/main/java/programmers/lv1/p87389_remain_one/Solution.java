package programmers.lv1.p87389_remain_one;

public class Solution {

    public int solution(int n) {
        int answer = 0;

        for (int x = 2; x <= n; x++) {
            if(n % x == 1) {
                answer = x;
                break;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(12);
        System.out.println("result = " + result);
    }

}