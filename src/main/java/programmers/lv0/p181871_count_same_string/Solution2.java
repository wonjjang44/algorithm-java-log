package programmers.lv0.p181871_count_same_string;

/**
 * indexOf 사용
 */
public class Solution2 {

    public int solution(String myString, String pat) {
        int answer = 0;
        int idx = 0;

//        while((idx = myString.indexOf(pat, idx)) != -1) {
//            answer ++;
//            idx = idx + 1; // 겹치는 경우를 대비하여 +1 => 시작 위치를 +1만 하여 겹치는 경우도 찾는다.
//            // ex) banana
//            //      ana
//            //        ana  => 첫 번째 ana과 두 번째 ana이 겹치기 때문에 시작 위치를 + 1만 해준다
//        }

        while(true) {
            int findStrIdx = myString.indexOf(pat, idx);

            if(findStrIdx == -1) break;

            answer ++;
            idx = findStrIdx + 1;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int result = solution.solution("banana", "ana");
        System.out.println("result = " + result);
    }

}
