package programmers.lv1.p76501_minus_pius_abs_sum;

public class Solution {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++)
            // 일반적인 방법
            // answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];

            // 부호를 변경해주는 방식도 있음.
            answer += absolutes[i] * (signs[i] ? 1 : -1);

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{4,7,12}, new boolean[]{true,false,true});
        System.out.println("result = " + result);
    }
}
