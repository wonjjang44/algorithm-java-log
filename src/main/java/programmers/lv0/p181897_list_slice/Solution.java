package programmers.lv0.p181897_list_slice;

import java.util.Arrays;

/**
 * arraycopy() 메서드 사용
 */
public class Solution {

    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        switch (n) {
            case 1:
                answer = new int[slicer[1] + 1];
                System.arraycopy(num_list, 0, answer, 0, answer.length);
                break;
            case 2:
                answer = new int[num_list.length - slicer[0]];
                System.arraycopy(num_list, slicer[0], answer, 0, answer.length);
                break;
            case 3:
                answer = new int[slicer[1] - slicer[0] + 1];
                System.arraycopy(num_list, slicer[0], answer, 0, answer.length);
                break;
            default:
                answer = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
                int idx = slicer[0];

                for (int i = 0; i < answer.length; i++) {
                    answer[i] = num_list[idx];

                    idx+=slicer[2];
                }
        }

        return answer;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("result = " + Arrays.toString(result));
    }
}
