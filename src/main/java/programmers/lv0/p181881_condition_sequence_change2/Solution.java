package programmers.lv0.p181881_condition_sequence_change2;

import java.util.Arrays;

public class Solution {

    public int solution(int[] arr) {
        int answer = 0;

        int[] beforeArr = new  int[arr.length];

        while(true) {
            System.arraycopy(arr, 0, beforeArr, 0, arr.length);

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = (arr[i] * 2) + 1;
                }
            }

            boolean isSame = Arrays.equals(beforeArr, arr);
            if(isSame) return answer;

            answer++;
        }

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 3, 100, 99, 98});
        System.out.println("result = " + result);
    }

}
