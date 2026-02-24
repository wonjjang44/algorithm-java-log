package programmers.lv0.p181874_highlight_A;

public class Solution {

    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        myString = myString.toLowerCase();

        // 첫 문자가 대문자 A 로 올 경우 소문자로 변경되므로 테스트 케이스 3에 걸림
        String[] strArr = myString.split("");

        for (int i = 0; i < strArr.length; i++) {
            if("a".equals(strArr[i])) answer.append(strArr[i].toUpperCase());
            else answer.append(strArr[i].toLowerCase());
        }

        return answer.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("Abstract algebra");
        System.out.println("result = " + result);
    }

}
