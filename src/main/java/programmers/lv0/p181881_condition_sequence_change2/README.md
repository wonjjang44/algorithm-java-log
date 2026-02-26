# p181881 - 조건에 맞게 수열 변환하기2

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181881
- --

## 요약
정수 배열이 주어질 때, 배열 원소의 값이 50보다 크거나 같고, 짝수라면 2로 나누고,<br/>
50보다 작고, 홀수라면 2를 곱하고 1을 더한다.<br/>
위 과정을 n번 반복한 결과인 배열을 arr(n) 라고 표현할 때, arr(n) = arr(n + 1)인 n이 항상 존재한다.<br/>
이러한 n 중 가장 작은 값을 리턴하는 메서드 구현.
- --

## 접근
- 범위를 모르니까 while을 사용
- 이전 배열을 기억하고 있어야 할 듯
- --

## 회고
- 배열과 배열의 비교는 ==이 아닌 Arrays.equals() 메서드를 사용한다.
- 기존에 int[] beforeArr; beforeArr = arr; 이런식으로 할당 후 Arrays.equals를 사용했더니 항상 true가 나옴
- System.arraycopy() 메서드를 사용해서 새로운 배열에 할당 후 사용했더니 정상 작동 함
