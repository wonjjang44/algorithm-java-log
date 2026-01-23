package programmers.lv1.p86051_not_exists_num_sum;

import java.util.Arrays;

public class Solution {

    public int solution(int[] numbers) {
        int answer = 0;

        // 0 ~ 9 까지의 수를 저장한 배열 선언
        int[] numArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 기존 numbers 배열 오름차순 정렬
        Arrays.sort(numbers);

        // numbers 배열 길이 10으로 맞추고 값 채워 넣기(numArr 길이와 맞춘다)
        int[] newNumbers = new int[numArr.length];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);

        // 비교 시작
        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i] != newNumbers[i]) {
                answer += numArr[i];

                // 오른쪽으로 shift
                for (int j = newNumbers.length - 1; j > i; j--)
                    newNumbers[j] = newNumbers[j - 1];
            }
        }

        return answer;


        // 다른 풀이
//        int sum = 45;
//        for (int number : numbers)
//            sum -= number;
//
//        return sum;
    }




    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
        System.out.println("result = " + result);
    }

}
