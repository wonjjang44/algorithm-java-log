package programmers.lv0.p181878_find_wish_string;

/**
 * 슬라이딩 윈도우 방식
 */
public class Solution {

    public int solution(String myString, String pat) {
        int answer = 0;

        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        int strLength = myString.length();
        int patLength = pat.length();

        if(strLength < patLength) return 0;

        char[] myStringCharArr = myString.toCharArray();
        char[] patCharArr = pat.toCharArray();

        for (int i = 0; i <= strLength - patLength; i++) {
            boolean isContains = true;

            for (int j = 0; j < patLength; j++) {
                if(myStringCharArr[i + j] != patCharArr[j]) {
                    isContains = false;
                    break;
                }
            }

            if(isContains) return 1;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result1 = solution.solution("AbCdEfG", "aBc");
        System.out.println("result1 = " + result1);
    }

}
