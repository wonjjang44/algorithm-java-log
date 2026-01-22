package programmers.lv1.p81301_number_str_engwords;

public class Solution {

    public int solution(String s) {
        String[] wordsArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // 영단어 조립용
        StringBuilder engWord = new StringBuilder();

        // 최종적으로 리턴할 숫자 문자열
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 문자열에 숫자가 포함돼 있는지 체크(숫자는 비교할 필요 X)
            if('0' <= c && c <= '9') {
                result.append(c);

                continue;
            }

            engWord.append(c);

            for (String string : wordsArr) {
                if (engWord.toString().equals(string)) {
                    result.append(engWord);

                    // 초기화
                    engWord.setLength(0);
                    break;
                }
            }

        }

        return Integer.parseInt(result.toString());


        // replaceAll 메서드를 이용한 방법
//        for (int i = 0; i < wordsArr.length; i++)
//            s = s.replaceAll(wordsArr[i], String.valueOf(i));
//
//        return Integer.parseInt(s);
    }




    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("one4seveneight");
        System.out.println("result = " + result);
    }
}
