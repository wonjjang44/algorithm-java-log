# p68935 - 3진법 뒤집기

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/68935
- --

## 요약
자연수 n을 3진법 상에서 뒤집은 뒤, 10진법으로 표현한 수를 리턴하는 메서드 구현
- --

## 접근
- n이 0보다 클 때 까지 반복하면서 List에 n을 3으로 나눈 나머지를 add한다
- Collections의 reverse 메서드를 사용하여 순서를 뒤바꾼다
- 리스트 사이즈 만큼 루프를 돌면서 10진법 계산을 수행한다
- -- 

## 회고
- reverse() 메서드로 뒤집지 않고 for문에서 바로 처리해도 될 것 같음