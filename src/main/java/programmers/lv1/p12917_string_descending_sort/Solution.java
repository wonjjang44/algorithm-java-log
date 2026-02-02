package programmers.lv1.p12917_string_descending_sort;

public class Solution {

    public String solution(String s) {
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length - 1; i++) {
            int maxIdx = i;

            for (int j = i + 1; j < charArr.length; j++) {
                char a = charArr[maxIdx];
                char b = charArr[j];

                boolean flag = a < b;

                if(flag) maxIdx = j;
            }

            // swap
            char temp = charArr[i];
            charArr[i] = charArr[maxIdx];
            charArr[maxIdx] = temp;
        }

        return new String(charArr);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("Zbcdefg");
        System.out.println("result = " + result);
    }

}
