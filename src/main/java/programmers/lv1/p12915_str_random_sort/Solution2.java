package programmers.lv1.p12915_str_random_sort;

import java.util.Arrays;

/**
 * 선택정렬
 */
public class Solution2 {

    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length - 1; i++) {
            // 최초 비교 기준 값 선정(ex => u)
            int initVal = i;

            for (int j = i + 1; j < strings.length; j++) {
                // 첫 번째 값
                String a = strings[initVal];
                // 두 번째 값
                String b = strings[j];

                char ca = a.charAt(n);
                char cb = b.charAt(n);

                // 비교 기준값 후보 플래그 값
                boolean candidateFlag = false;

                // 기준값이 더 클 때(기준 값 후보)
                if(ca > cb) {
                    candidateFlag = true;
                }else if(ca == cb) {
                    if(a.compareTo(b) > 0) {
                        candidateFlag = true;
                    }
                }

                // 기준값 후보 변경
                if(candidateFlag) initVal = j;

            }


            // swap(기준값이 변경됐을 때)
            if(initVal != i) {
                String temp = strings[i];
                strings[i] = strings[initVal];
                strings[initVal] = temp;
            }
        }

        return strings;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
//        String[] result = solution.solution(new String[]{"sun", "bed", "car"}, 1);
        String[] result = solution.solution(new String[]{"abcd", "abce", "cdx"}, 2);
        System.out.println("result = " + Arrays.toString(result));
    }

}
