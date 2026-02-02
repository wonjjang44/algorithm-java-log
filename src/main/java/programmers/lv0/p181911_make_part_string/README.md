# p181911 - 부분 문자열 이어 붙여 문자열 만들기

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181911
- --

## 요약
문자열 배열과 이차원 정수 배열이 주어졌을 때, 이차원 배열은 [s, e] 형태로 문자열 배열의 index s ~ e까지의
- --

## 접근
- 파라미터로 받은 문자열 배열의 문자열 값들을 substring하여 다시 문자열로 합쳐 리턴
- -- 

## 회고
- substring 사용
  - substring 두 번째 파라미터 값으로 end + 1을 부여하여 end를 포함하게 해야 함