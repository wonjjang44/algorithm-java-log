package programmers.lv0.p181879_calc_of_length;

public class Solution {

    public int solution(int[] numList) {
        int length = numList.length;

        int answer = (length >= 11 ? 0 : 1);

        for (int i = 0; i < length; i++) {
            if(length >= 11) answer += numList[i];
            else answer *= numList[i];
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1});
        int result1 = solution.solution(new int[]{2, 3, 4, 5});
        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);
    }

}
