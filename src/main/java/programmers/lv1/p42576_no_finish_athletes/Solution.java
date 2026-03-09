package programmers.lv1.p42576_no_finish_athletes;

import java.util.Arrays;

public class Solution {

    public String solution(String[] participant, String[] completion) {
        // 선 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        System.out.println("participant = " + Arrays.toString(participant));
        System.out.println("completion = " + Arrays.toString(completion));

        System.out.println();

        for (int i = 0; i < completion.length; i++) {
            System.out.println("participant["+i+"] = " + participant[i]);
            System.out.println("completion["+i+"] = " + completion[i]);

            if(!participant[i].equals(completion[i]))
                return participant[i];
        }

        return participant[participant.length - 1];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        String result = solution.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        String result = solution.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
//        String result = solution.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println("result = " + result);
    }

}
