package programmers.lv0.p181892_from_n;

import java.util.Arrays;

public class Solution2 {

    public int[] solution(int[] arr, int n) {
        return Arrays.copyOfRange(arr, n -1, arr.length);
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] result = solution.solution(new int[]{2, 1, 6}, 3);
//        int[] result = solution.solution(new int[]{5, 2, 1, 7, 5}, 2);
        System.out.println("result = " + Arrays.toString(result));
    }

}
