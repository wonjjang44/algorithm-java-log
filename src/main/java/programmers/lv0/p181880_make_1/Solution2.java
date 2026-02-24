package programmers.lv0.p181880_make_1;

/**
 * 이진수의 성질 이용
 */
public class Solution2 {

    public int solution(int[] numList) {
        int answer = 0;

        for (int i = 0; i < numList.length; i++) {
            String binary = Integer.toBinaryString(numList[i]);
            System.out.println("binary = " + binary);
            System.out.println("binary.length() = " + binary.length());
            answer += binary.length() - 1;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int result = solution.solution(new int[]{12, 4, 15, 1, 14});
        System.out.println("result = " + result);
    }

}
