package programmers.lv0.p181925_number_manipulate2;

public class Solution {

    public String solution(int[] numLog) {
        String answer = "";

        // 입력한 수의 개수는 전체 log - 1이므로 => numLog.length - 1
        for (int i = 0; i < numLog.length - 1; i++) {
            int x = numLog[i + 1] - numLog[i];

            if(x == 1) answer += "w";
            else if(x == -1) answer += "s";
            else if(x == 10) answer += "d";
            else answer += "a";
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1});
        System.out.println("result = " + result);
    }

}