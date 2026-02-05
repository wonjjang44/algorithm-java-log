package programmers.lv0.p181893_array_slice;

import java.util.Arrays;

/**
 * 짝수/홀수 조건에 따라 인덱스 값만 계산한 다음
 * 루프가 끝난 시점에 배열 복사 파라미터로 사용하는 방법
 */
public class Solution2 {

    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            // 뒤에서 자르기
            if(i % 2 == 0) end = start + query[i];
            // 앞에서 자르기
            else start = start + query[i];
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] result = solution.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2});
        System.out.println("result = " + Arrays.toString(result));
    }

}
