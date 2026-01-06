package programmers.lv0.p181910_string;

public class Solution {

    public String solution(String my_string, int n) {
        String answer = "";

        // 앞에서 자르기
        answer = my_string.substring(0, n);

        // 뒤에서 자르기
//        answer = my_string.substring(my_string.length() - n);

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("ProgrammerS123", 11);
        System.out.println("result = " + result);
    }

}