package programmers.lv1.p12906_hate_same_word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 배열 리스트 자료구조 사용
 */
public class Solution2 {

    public List<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int preNum = Integer.MAX_VALUE;

        for(int num : arr) {
            if(preNum != num) list.add(num);

            preNum = num;
        }

        return list;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        List<Integer> result = solution.solution(new int[]{1,1,3,3,0,1,1});
        System.out.println("result = " + result);
    }

}
