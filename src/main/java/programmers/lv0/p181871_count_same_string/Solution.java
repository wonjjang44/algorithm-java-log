package programmers.lv0.p181871_count_same_string;

public class Solution {

    public int solution(String myString, String pat) {
        int answer = 0;

        int mLength = myString.length();
        int pLength = pat.length();

        char[] mCharArr = myString.toCharArray();
        char[] pCharAr = pat.toCharArray();

        for (int i = 0; i < mLength - pLength + 1; i++) {
            boolean isSame = true;

            for (int j = 0; j < pLength; j++) {
                System.out.println("mCharArr[i + j] = " + mCharArr[i + j]);
                System.out.println("pCharAr["+j+"] = " + pCharAr[j]);
                if(mCharArr[i + j] != pCharAr[j]) {
                    isSame = false;
                    break;
                }
            }

            if(isSame) answer ++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("banana", "ana");
        System.out.println("result = " + result);
    }

}
