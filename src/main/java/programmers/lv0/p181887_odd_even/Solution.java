package programmers.lv0.p181887_odd_even;

public class Solution {

    public int solution(int[] numList) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < numList.length; i++) {
            if(i % 2 == 0) {
                odd += numList[i];
            } else {
                even += numList[i];
            }
        }

        return Math.max(odd, even);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{4, 2, 6, 1, 7, 6});
        System.out.println("result = " + result);
    }
    
}
