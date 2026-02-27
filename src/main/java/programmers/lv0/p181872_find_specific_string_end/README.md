# p181872 - 특정 문자열로 끝나는 가장 긴 문자열 찾기

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181872
- --

## 요약
myString, pat 문자열이 주어질 때, myString의 부분 문자열 중,<br/>
pat으로 끝나는 가장 긴 부분 문자열을 리턴하는 메서드 구현
- --

## 접근
- pat으로 받은 문자열의 마지막 값을 latsIndexOf() 메서드를 사용하여 인덱스를 뽑아낸다.
- 그 자리까지 substring한다.
- 이후 다시 pat과 연결한다
- --

## 회고
- lastIndexOf 메서드가 핵심
- 해당 메서드가 뒤에서부터 시작한다라는 것을 알고 있었지만 맨 뒤 기준, 인덱스 0부터 세는 줄 앎.
- ex) abcdef => 인덱스 == 0 ~ 5 => lastIndexOf(e) => f = 5, e = 4