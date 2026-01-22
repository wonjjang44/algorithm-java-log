package programmers.lv1.p147355_size_diff_numstr;

public class Solution {

    public int solution(String t, String p) {
        int answer = 0;

        int size = t.length() - p.length();

        for (int i = 0; i <= size; i++) {
            String subStr = t.substring(i, p.length() + i);
            // 문제 조건 확인
            if(Long.parseLong(subStr) <= Long.parseLong(p)) answer++;
        }

        return answer;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("10203", "15");
        System.out.println("result = " + result);
    }

}
