# p181871 - 문자열이 몇 번 등장하는지 세기

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181871
- --

## 요약
문자열 myString과 pat이 주어질 때, myString에서 pat이 등장하는 횟수를 리턴하는 메서드 구현
- --

## 접근
- 슬라이딩 윈도우 알고리즘 사용
- --

## 회고
- 더 간략하게 substring과 startsWith 메서드를 사용하여 구현할 수 있을 것 같음
- 너무 슬라이딩 윈도우(O(NM))만 고집하는 것 같음
  - 순차적으로 모두 일일이 비교하기 때문에 최악의 경우 O(N * M)이 나옴
- Solution2 에서 indexOf 메서드를 사용하여 구현했는데 왜 idx = idx + 1??
  - 서로 겹치는 부분을 포함시키기 위해 시작 위치를 +1 