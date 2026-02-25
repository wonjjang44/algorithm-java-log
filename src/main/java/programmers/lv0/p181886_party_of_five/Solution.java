package programmers.lv0.p181886_party_of_five;

import java.util.Arrays;

public class Solution {

    public String[] solution(String[] names) {
        int size = names.length / 5 + (names.length % 5 == 0 ? 0 : 1);
        String[] answer = new String[size];

        int idx = 0;

        for (int i = 0; i < names.length; i++)
            if(i % 5 == 0) answer[idx++] = names[i];

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"});
        System.out.println("result = " + Arrays.toString(result));
    }

}
