package programmers.lv1.p68644_choose_two_number_plus;

import java.util.*;

public class Solution {

    public int[] solution(int[] numbers) {
        int[] answer = {};

        // 중복 제거를 위해 Set 자료구조 선택
        Set<Integer> set = new HashSet<>();

        // 0번 째 ~ 첫 번째, 두 번째, ... 꼴
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++)
                set.add(numbers[i] + numbers[j]);
        }

        // 기존 배열 사이즈 정의
        answer = new int[set.size()];

        int idx = 0;

        // 배열에 Set에 담겨있는 값 넣기
        for (Integer integer : set)
            answer[idx++] = integer;

        // 오름차순 정렬
        Arrays.sort(answer);

        return answer;
    }




    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{2, 1, 3, 4, 1});
        System.out.println("result = " + Arrays.toString(result));
    }

}
