package programmers.lv0.p181927_last_both_element;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] num_list) {
        int lastElement = num_list[num_list.length - 1];
        int beforeLastElement = num_list[num_list.length - 2];

        // 배열의 크기 설정
        // 1. 배열의 크기를 num_list.length + 1만큼 늘린다
        // 2. 기존 num_list에 있던 값들을 반복하여 num_list.lnegth + 1인 배열에 값을 할당한다
        // 3. 해당 배열의 마지막 인덱스에 값을 할당한다.
        int[] new_num_list = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++)
            new_num_list[i] = num_list[i];

        if (lastElement > beforeLastElement) {
            lastElement -= beforeLastElement;

            // 배열에 마지막 값에 넣는다
            new_num_list[new_num_list.length -1] = lastElement;

            return new_num_list;
        }

        new_num_list[new_num_list.length - 1] = 2 * lastElement;

        return new_num_list;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{2, 1, 6});
        System.out.println("result = " + Arrays.toString(result));
    }
}
