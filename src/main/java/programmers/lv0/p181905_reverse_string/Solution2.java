package programmers.lv0.p181905_reverse_string;

/**
 * substring 사용
 */
public class Solution2 {

    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();

        String tempStr = my_string.substring(s,e+1);
        for(int i = tempStr.length()-1; i >= 0; i--){
            sb.append(tempStr.charAt(i));
        }

        my_string = my_string.substring(0,s) + sb.toString() + my_string.substring(e+1);

        return my_string;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String result = solution.solution("Progra21Sremm3", 6, 12);
        String result2 = solution.solution("Stanley1yelnatS", 4, 10);
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }

}
