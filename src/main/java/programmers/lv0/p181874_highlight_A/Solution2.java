package programmers.lv0.p181874_highlight_A;

/**
 * replace 메서드 사용
 * 기존 문자열을 전부 소문자로 변경한 후 소문자 a를 대문자 A로 변경한 뒤 리턴
 */
public class Solution2 {

    public String solution(String myString) {
        return myString.toLowerCase().replace("a", "A");
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String result = solution.solution("abstract algebra");
        System.out.println("result = " + result);
    }

}
