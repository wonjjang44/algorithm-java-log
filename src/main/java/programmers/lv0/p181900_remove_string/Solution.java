package programmers.lv0.p181900_remove_string;

public class Solution {

    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        char[] charArr = my_string.toCharArray();

        for (int i = 0; i < indices.length; i++)
            charArr[indices[i]] = ' ';

        sb.append(charArr);

//        for (int i = 0; i < indices.length; i++) {
            // list.remove(indices[i]); // 인덱스가 제거된 리스트에 맞게 다시 초기화됨
//        }

        return sb.toString().replaceAll(" ", "");
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3});
        System.out.println("result = " + result);
    }
}
