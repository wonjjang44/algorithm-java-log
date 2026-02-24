package programmers.lv0.p181878_find_wish_string;

/**
 * indexOf 및 contains 메서드 사용
 */
public class Solution2 {

    public int solution(String myString, String pat) {
//        return myString.toLowerCase().indexOf(pat.toLowerCase()) != -1 ? 1 : 0;
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int result = solution.solution("AbCdEfG", "aBc");
        System.out.println("result = " + result);
    }

}
