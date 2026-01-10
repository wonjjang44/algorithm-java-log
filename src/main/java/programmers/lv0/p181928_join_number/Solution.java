package programmers.lv0.p181928_join_number;

public class Solution {

    public int solution(int[] num_list) {
        StringBuilder evenNum = new StringBuilder();
        StringBuilder oddNum = new StringBuilder();

        for (int j : num_list) {
            StringBuilder sumResult = j % 2 == 0 ? evenNum.append(j) : oddNum.append(j);
        }

        return Integer.parseInt(evenNum.toString()) + Integer.parseInt(oddNum.toString());
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        int result = solution.solution(new int[]{3, 4, 5, 2, 1});
        int result = solution.solution(new int[]{5, 7, 8, 3});
        System.out.println("result = " + result);
    }
}
