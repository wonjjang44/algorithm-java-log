package programmers.lv0.p181888_gap_of_element;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] numList, int n) {
        int[] answer = new int[numList.length];

        int idx = 0;

//        for (int i = 0; i < numList.length; i++) {
//            if(i % n == 0) {
//                answer[idx] = numList[i];
//                idx++;
//            }
//        }

        for (int i = 0; i < numList.length; i += n)
            answer[idx++] = numList[i];

        return Arrays.copyOf(answer, idx);
    }
    
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{4, 2, 6, 1, 7, 6}, 2);
        System.out.println("result = " + Arrays.toString(result));
    }
    
}
