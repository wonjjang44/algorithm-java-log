package programmers.lv0.p181902_string_count;

import java.util.Arrays;

public class Solution {

    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] alphabets = new char[]{
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        };

        char[] charArr = my_string.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if(charArr[i] == alphabets[j]) {
                    if(answer[j] == 0) answer[j] = 1;
                    else answer[j] += 1;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution("Programmers");
        System.out.println("result = " + Arrays.toString(result));
    }
}
