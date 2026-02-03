package programmers.lv0.p181894_area_of_two;

import java.util.Arrays;

/**
 * flag값 활용하기
 */
public class Solution3 {

    public int[] solution(int[] arr) {
        int[] answer = {};
        boolean fFlag = true;
        boolean lFlag = false;

        boolean mFlag = false;

        int firstIdx = 0;
        int lastIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (fFlag && arr[i] == 2) {
                firstIdx = i;
                fFlag = false;
                lFlag = true;
                mFlag = true;
            } else if (lFlag && arr[i] == 2) {
                lastIdx = i;
            }
        }

        if (!mFlag) {
            answer = new int[1];
            answer[0] = -1;
        }
        if (mFlag && lastIdx == 0) {
            lastIdx = firstIdx;
        }

        if (mFlag && lastIdx - firstIdx == 0) {
            answer = new int[1];
            answer[0] = arr[firstIdx];
        } else if (mFlag) {
            answer = new int[lastIdx - firstIdx + 1];
            int idx = 0;
            for (int i = firstIdx; i <= lastIdx; i++) {
                answer[idx++] = arr[i];
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Solution3 solution = new Solution3();
//        int[] result = solution.solution(new int[]{1, 2, 1, 4, 5, 2, 9});
//        int[] result = solution.solution(new int[]{1, 2, 1});
//        int[] result = solution.solution(new int[]{1, 1, 1});
        int[] result = solution.solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1});
        System.out.println("result = " + Arrays.toString(result));
    }
}
