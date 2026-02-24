package programmers.lv0.p181884_sum_bigger_than_n;

public class Solution {

    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];

            if(answer > n) break;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        int result = solution.solution(new int[]{34, 5, 71, 29, 100, 34}, 123);
        int result = solution.solution(new int[]{58, 44, 27, 10, 100}, 139);
        System.out.println("result = " + result);
    }

}
