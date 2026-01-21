# p76501 - 음양 더하기

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/76501
- --

## 요약
정수들의 절댓값을 차례로 담은 배열 absolutes, 정수들의 부호를 차례로 담은 배열 sings가 주어짐.<br/>
실제 정수들의 합을 return 하는 메서드 구현.
- --

## 접근
- absolutes 길이 만큼 루프를 돌면서 signs의 값이 true일 경우 answer 변수에 누적하고, false라면 뺀다.
- -- 

## 회고
- 조건에 따라 값을 더하주거나 빼줌.
- 다른 방법으로는 부호를 변경해주는 방법이 있음.
  - sings[i]가 true라면 1, false라면 -1을 리턴하여 기존 absolutes[i]와 곱한 값을 answer에 누적한다.