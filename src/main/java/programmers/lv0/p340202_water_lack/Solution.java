package programmers.lv0.p340202_water_lack;

public class Solution {

    public int solution(int storage, int usage, int[] change) {
        // 총 물 사용량
        int totalUseWater = 0;

        for (int i = 0; i < change.length; i++) {
            // 월 별 물 사용량
            usage += (usage * change[i]) / 100;

            // 총 물 사용량 누적 합계
            totalUseWater += usage;

            if(totalUseWater > storage) return i;
        }

        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(5141, 500, new int[]{10, -10, 10, -10, 10, -10, 10, -10, 10, -10});
//        int result = solution.solution(1000, 2000, new int[]{-10, 25, -33});
        System.out.println("result = " + result);
    }

}
