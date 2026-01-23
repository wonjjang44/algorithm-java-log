# p181922 - 수열과 구간 쿼리4

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181922
- --

## 요약
정수 배열 arr와 2차원 정수 배열 queries이 주어질 때,<br/>
queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴.<br/>
query마다 순서대로 s <= i <= e 인 모든 i에 대하여 i가 k의 배수라면 arr[i]에 1을 더한다.<br/>
최종적으로 arr 배열을 리턴하는 메서드를 구현할 것
- --

## 접근
- 구간 쿼리2 문제와 흡사함.
- i가 k의 배수 => i % k == 0 라면 i는 k의 배수
- -- 

## 회고
- 