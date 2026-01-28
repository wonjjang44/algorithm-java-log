package programmers.lv1.p68935_ternary_reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        while(n > 0) {
            list.add(n % 3);

            n /= 3;
        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++)
            answer += (list.get(i) * (int) Math.pow(3, i));

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(45);
        System.out.println("result = " + result);
    }

}
