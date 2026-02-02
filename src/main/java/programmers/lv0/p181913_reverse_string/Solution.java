package programmers.lv0.p181913_reverse_string;

public class Solution {

    public String solution(String myString, int[][] queries) {

        char[] charArr = myString.toCharArray();

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            while(start < end) {
                char temp = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(charArr);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}});
        System.out.println(result);
    }

}
