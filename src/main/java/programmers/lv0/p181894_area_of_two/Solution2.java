package programmers.lv0.p181894_area_of_two;

import java.util.Arrays;

/**
 * 정수 배열 그대로 사용하여 첫 번째 2에 대한 인덱스 값과 마지막 인덱스 값을 추출하여
 * 원본 배열을 부분 복사한다.
 */
public class Solution2 {

    public int[] solution(int[] arr) {
        int firstIdx = -1;
        int lastIdx = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                if(firstIdx == -1) firstIdx = i;

                lastIdx = i;
            }
        }

        if(firstIdx == -1) return new int[]{-1};

        return Arrays.copyOfRange(arr, firstIdx, lastIdx + 1); // lastIdx 전까지 복사하므로 + 1
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] result = solution.solution(new int[]{1, 2, 1, 4, 5, 2, 9});
//        int[] result = solution.solution(new int[]{1, 2, 1});
//        int[] result = solution.solution(new int[]{1, 1, 1});
//        int[] result = solution.solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1});
        System.out.println("result = " + Arrays.toString(result));
    }

}
