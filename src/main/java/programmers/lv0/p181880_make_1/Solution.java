package programmers.lv0.p181880_make_1;

public class Solution {

    public int solution(int[] numList) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < numList.length; i++) {
            answer = numList[i];

            while(answer > 1) {
                if(answer % 2 == 0) answer /= 2;
                else answer = (answer - 1) / 2;

                cnt ++;
            }
        }

        return cnt;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{12, 4, 15, 1, 14});
        System.out.println("result = " + result);
    }

}
