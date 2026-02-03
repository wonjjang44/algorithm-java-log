package programmers.lv0.p181894_area_of_two;

import java.util.Arrays;

/**
 * 실패 케이스
 *
 * 굳이 정수 배열을 문자열 배열로 만들 필요 없음.
 * 문자열 배열로 시도하면 인덱스 추출에서 꼬이거나 테스트 케이스(큰 수가 가장 앞에 나오는 경우)가 깨질 수 있음
 */
public class Solution {

    public int[] solution(int[] arr) {
        int[] answer = {-1};

        String fixNum = "2";

        String[] strNumArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strNumArr[i] = String.valueOf(arr[i]);
        }

        String strNum = String.join("", strNumArr);

        int cnt = 0;
        // 10의 자리 체크
        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.charAt(i) == '0') {
                cnt++;
            }
        }

        int findFirstIdx = strNum.indexOf(fixNum);
        int findLastIdx = strNum.lastIndexOf(fixNum) - cnt;

        if(findFirstIdx == -1 && findLastIdx == -1) return answer;

        String[] strArr = Arrays.copyOfRange(strNumArr, findFirstIdx, findLastIdx + 1);

        answer = new int[strArr.length];
        for (int i = 0; i < answer.length; i++)
            answer[i] = Integer.parseInt(strArr[i]);

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 2, 1, 4, 5, 2, 9});
//        int[] result = solution.solution(new int[]{1, 2, 1});
//        int[] result = solution.solution(new int[]{1, 1, 1});
//        int[] result = solution.solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1});
        System.out.println("result = " + Arrays.toString(result));
    }
}
