package programmers.lv1.p12977_make_prime_number;

public class Solution {

    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;

        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean isPrime = true;

                    // 소수(Prime Number)는 2부터 시작이므로 1또는 0이라면 false
                    if(sum < 2) isPrime = false;

                    // 2부터 √sum까지 % 계산
                    for (int l = 2; l * l <= sum; l++) {
                        // 2 ~ √sum까지 하나라도 나누어 떨어진다면 sum은 소수(Prime Number)가 아님.
                        // 따라서 더 검사할 필요 없으니 for문 break
                        if(sum % l == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if(isPrime) answer++;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 3, 4});
        System.out.println("result = " + result);
    }

}
