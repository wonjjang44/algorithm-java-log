package programmers.lv1.p12906_hate_same_word;

import java.util.Arrays;

public class Solution {

    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];

        int before = arr[0];
        System.out.println("최초 before = " + before);

        int idx = 0;
        answer[idx] = before;
        idx++;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                System.out.println("loop 내부 before = " + before);
//                System.out.println("arr[j] = " + arr[j]);
//                if(before == arr[j]) {
//                    System.out.println("compre와 arr[j]값이 같을 때, i = " + i);
//                    if(answer[i] != arr[j]) {
//                        answer[i] = arr[j];
//                    }
//                    System.out.println("compre와 arr[j]가 같을 때, answer = " + Arrays.toString(answer));
//                } else {
//                    System.out.println("before와 arr[j]가 다를 때, before = " + before);
//                    answer[i] = before;
//                    System.out.println("answer 배열 "+i+"번째에 삽입 answer = " + Arrays.toString(answer));
//                    before = arr[j];
//
//                    break;
//                }
//            }
//        }

        for (int i = 1; i < arr.length; i++) {
            if(before != arr[i]) {
                before = arr[i];
                answer[idx++] = before;
            }
        }

        return Arrays.copyOf(answer, idx);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] result = solution.solution(new int[]{1,1,3,3,0,1,1});
//        int[] result = solution.solution(new int[]{1,3,3});
        int[] result = solution.solution(new int[]{4, 4, 4, 3, 3});
        System.out.println("result = " + Arrays.toString(result));
    }
}
