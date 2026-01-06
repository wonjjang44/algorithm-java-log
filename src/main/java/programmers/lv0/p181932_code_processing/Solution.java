package programmers.lv0.p181932_code_processing;

public class Solution {

    public String solution(String code) {
        String answer = "";
        int mode = 0;

        StringBuilder ret = new StringBuilder();

        Character[] codeCharArr = new Character[code.length()];

        // 문자열 길이만큼 char 타입으로 나눠 배열에 담기
        for (int i = 0; i < code.length(); i++) codeCharArr[i] = code.charAt(i);

        for (int i = 0; i < codeCharArr.length; i++) {
            if(mode == 0) {
                if (!codeCharArr[i].equals('1') && (i % 2) == 0) ret.append(codeCharArr[i]);
                else if(codeCharArr[i].equals('1')) mode = 1;

                continue;
            }

            if(!codeCharArr[i].equals('1') && (i % 2) != 0) ret.append(codeCharArr[i]);
            else if(codeCharArr[i].equals('1')) mode = 0;
        }

        if(ret.length() == 0) ret.append("EMPTY");

        answer = ret.toString();

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("abc1abc1abc");
        System.out.println("result = " + result);
    }

}