package programmers.lv0.p001;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = (angle1 + angle2) % 360; // 각도의 합은 360이므로 360배수의 나머지
        System.out.println(sum_angle);
    }
}
