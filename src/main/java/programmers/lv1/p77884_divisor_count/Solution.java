package programmers.lv1.p77884_divisor_count;

public class Solution {

    public int solution(int left, int right) {
        int answer = 0;

        // 이중 for문 사용한 방식
//        for (int i = left; i <= right; i++) {
//            int cnt = 0;
//
//            for (int j = 1; j <= i; j++)
//                if(i % j == 0) cnt++;
//
//            answer =  cnt % 2 == 0 ? answer + i : answer - i;
//        }

        // 제곱근을 이용한 방식
        for (int i = left; i <= right; i++)
            // 제곱근이라면 약수의 개수는 홀수개가 된다.(자기 자신과 곱해지는 쌍이 있으므로)
            answer = i % Math.sqrt(i) == 0 ? answer - i : answer + i;

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(13, 17);
        System.out.println("result = " + result);
    }

}
