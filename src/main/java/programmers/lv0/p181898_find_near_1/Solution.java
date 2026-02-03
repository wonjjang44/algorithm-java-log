package programmers.lv0.p181898_find_near_1;

public class Solution {

    public int solution(int[] arr, int idx) {
        int answer = 0;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{0, 0, 0, 1}, 1);
//        int result = solution.solution(new int[]{1, 0, 0, 1, 0, 0}, 4);
//        int result = solution.solution(new int[]{1, 1, 1, 1, 0}, 3);
        System.out.println("result = " + result);
    }

}
