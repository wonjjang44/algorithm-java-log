package programmers.lv0.p181911_make_part_string;

public class Solution {

    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];

            String subStr = my_strings[i].substring(start, end + 1);
            sb.append(subStr);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}});
        System.out.println("result = " + result);

    }

}
