package programmers.lv0.p181897_list_slice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * switch + for
 * n = 4 일 때의 조건은 나머지 연산으로 처리
 */
public class Solution2 {

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        switch(n){
            case 1 :
                for(int i = 0; i <= slicer[1]; i++)
                    list.add(num_list[i]);
                break;
            case 2 :
                for(int i = slicer[0]; i < num_list.length; i++)
                    list.add(num_list[i]);
                break;
            case 3 :
                for(int i = slicer[0]; i <= slicer[1]; i++)
                    list.add(num_list[i]);
                break;
            case 4 :
                int idx = slicer[2];
                for(int i = slicer[0]; i <= slicer[1]; i++){
                    if(idx % slicer[2] == 0){
                        list.add(num_list[i]);
                    }
                    idx++;
                }
                break;
        }
        answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);

        return answer;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] result = solution.solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("result = " + Arrays.toString(result));
    }

}
