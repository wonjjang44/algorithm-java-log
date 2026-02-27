package programmers.lv0.p181872_find_specific_string_end;

public class Solution {

    public String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat);

        return myString.substring(0, idx) + pat;
    }
    
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("AbCdEFG", "dE");
        System.out.println("result = " + result);
    }
    
}
