# p181910, p181907 - 문자열 앞/뒤의 n글자

- 링크: 
- https://school.programmers.co.kr/learn/courses/30/lessons/181910
- https://school.programmers.co.kr/learn/courses/30/lessons/181907
- --

## 요약
문자열 my_string과 정수 n이 매개변수로 주어질 때,<br/>
my_string의 앞/뒤의 n글자로 이루어진 문자열을 리턴하는 메서드 작성
- --

## 접근
- 문자열 자르기 문제
- substring() 사용
  - 앞 > 처음부터 n까지 자름
  - 뒤 > 문자열 전체 길이 - n 을 시작 ~ 끝까지 자름
- -- 

## 회고
- substring() 메서드를 사용하면 되지만 루프를 사용한 방법도 고려해 봐야겠음