# p181904 - 세로 읽기

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181904
- --

## 요약
문자열과 두 정수가 주어질 때, my_string을 한 줄에 m 글자씩 가로로 적고,<br/>
왼쪽 기준 c번째 열에 적힌 글자들을 문자열로 리턴하는 메서드 구현.<br/>
ex) ihrhbakrfpndopljhygc, m = 4, c = 2 일 때, happy 출력
1열	2열	3열	4열
 i	 h	 r	 h
 b	 a	 k	 r
 f	 p	 n	 d
 o	 p	 l	 j
 h	 y	 g	 c
- --

## 접근
- substring() 메서드 사용
- 시작 값을 초기 0으로 지정하고 해당 값에 m을 누적한 값을 루프를 돌면서 적용한다.
- 루프 반복 횟수는 문자열 길이 / m
- ex) (0, 4), (4, 8), (8, 12), (12, 16), (16, 20)
- 열부분은 charAt(c - 1) 메서드를 사용하여 뽑아낸다.(c는 인덱스 값이 아니므로 -1)
- --

## 회고
- substring()의 인자값에 대한 규칙을 찾음