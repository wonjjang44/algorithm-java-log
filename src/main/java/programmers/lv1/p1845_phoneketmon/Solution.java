package programmers.lv1.p1845_phoneketmon;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] nums) {
        int n = nums.length;
        System.out.println("n = " + n);

        int choiceNum = n / 2;
        System.out.println("choiceNum = " + choiceNum);

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int typeCount = set.size();
        System.out.println("typeCount = " + typeCount);

        return Math.min(typeCount, choiceNum);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        int result = solution.solution(new int[]{3,1,2,3});
//        int result = solution.solution(new int[]{3,3,3,2,2,4});
        int result = solution.solution(new int[]{3,3,3,2,2,2});
        System.out.println("result = " + result);
    }

}
