package programmers.lv0.p181905_reverse_string;

/**
 * swap 사용
 */
public class Solution {

    public String solution(String myString, int s, int e) {
        StringBuilder sb = new StringBuilder();

        char[] charArr = myString.toCharArray();

        int idx = 0;

        int start = s;
        int end = e;

        for (int i = 0; i < charArr.length; i++) {
            if(idx >= start && idx <= end) {
                char temp = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = temp;

                start++;
                end--;
            }

            sb.append(charArr[i]);
            idx++;
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("Progra21Sremm3", 6, 12);
        String result2 = solution.solution("Stanley1yelnatS", 4, 10);
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }
}
