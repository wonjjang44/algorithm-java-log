package programmers.lv0.p181931_seq;

public class Solution {

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        // 첫 째항이 a 이고 공차가 d인 수열을 저장할 int array
        int[] seq = new int[included.length];

        // 첫 번째 항 세팅
        seq[0] = a;

        // 나머지 항 세팅 => (ex_[3, 7, 11, 15, 19])
        for (int i = 1; i < seq.length; i++)
            seq[i] = a += d;

        // included 배열의 값이 true인 인덱스에 해당하는 값을 더한다
        for (int i = 0; i < included.length; i++) {
            if (included[i])
                answer += seq[i];
        }

        return answer;
    }

}


class MainClass {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(3, 4, new boolean[]{true, false, false, true, true});

        System.out.println("result = " + result);
    }
}