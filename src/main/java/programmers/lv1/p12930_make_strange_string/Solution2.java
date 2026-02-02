package programmers.lv1.p12930_make_strange_string;

/**
 * 원본 문자열 그대로 사용
 */
public class Solution2 {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == ' ') {
                sb.append(" ");
                idx = 0;
            } else {
                if(idx % 2 == 0) sb.append(Character.toUpperCase(ch));
                else sb.append(Character.toLowerCase(ch));
                idx++;
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
//        String result = solution.solution("try hello world");
//        String result = solution.solution("AA aa ZZ zz"); // Aa Aa Zz Zz
        String result = solution.solution("  TRy HElLo  WORLD   "); //  TrY HeLlO  WoRlD
        System.out.println("result = " + result);
    }

}
