package programmers.lv0.p181904_read_height;

public class Solution {

    public StringBuilder solution(String myString, int m, int c) {
        StringBuilder sb = new StringBuilder();

        int initIdx = 0;

        for (int i = 0; i < myString.length() / m; i++) {
            String subStr = myString.substring(initIdx, initIdx + m);
            initIdx += m;

            sb.append(subStr.charAt(c - 1));
        }

        return sb;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        StringBuilder result = solution.solution("ihrhbakrfpndopljhygcm", 4, 2);
//        StringBuilder result = solution.solution("programmers", 1, 1);
        System.out.println("result = " + result);
    }
}
