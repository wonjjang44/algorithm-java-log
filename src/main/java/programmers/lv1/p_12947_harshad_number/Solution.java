package programmers.lv1.p_12947_harshad_number;

public class Solution {

    public boolean solution(int x) {
        int sum = 0;

        String[] strNumArr = String.valueOf(x).split("");
        for (int i = 0; i < strNumArr.length; i++)
            sum += Integer.parseInt(strNumArr[i]);

        return x % sum == 0;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution(13);
        System.out.println("result = " + result);
    }

}
