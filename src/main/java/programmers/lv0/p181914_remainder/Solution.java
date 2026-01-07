package programmers.lv0.p181914_remainder;

public class Solution {

    public int solution(String number) {
        int answer = 0;

        String[] numStrArr = number.split("");

        for (String s : numStrArr)
            answer += Integer.parseInt(s);

        answer %= 9;

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("78720646226947352489");
        System.out.println("result = " + result);
    }
}
