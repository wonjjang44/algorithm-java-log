package programmers.lv1.p86491_min_rectangle;

public class Solution {

    public int solution(int[][] sizes) {
        int wMax = Integer.MIN_VALUE;
        int hMax = Integer.MIN_VALUE;

        for (int i = 0; i < sizes.length; i++) {
            int width =  sizes[i][0];
            int height = sizes[i][1];

            if(width < height) {
                int temp = width;
                width = height;
                height = temp;
            }

            wMax = Math.max(wMax, width);
            hMax = Math.max(hMax, height);

        }

        return wMax * hMax;

        // 다른 풀이
//        int length = 0, height = 0;
//        for (int[] card : sizes) {
//            length = Math.max(length, Math.max(card[0], card[1]));
//            height = Math.max(height, Math.min(card[0], card[1]));
//        }
//        int answer = length * height;
//        return answer;

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println("result = " + result);
    }

}
