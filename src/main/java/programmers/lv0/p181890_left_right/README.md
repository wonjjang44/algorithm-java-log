# p181890 - 왼쪽 오른쪽

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181890
- --

## 요약
문자열 배열 ["u", "d", "l", "r"] 존재할 때, "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면<br/>
해당 문자열 기준으로 왼쪽에 있는 문자열을 순서대로 담은 배열을, "r"이 먼저 나왔다면<br/>
"r" 기준 오른쪽에 있는 문자열을 순서대로 담은 배열을 리턴하는 메서드 구현.<br/>
단, "l" 또는 "r"이 없다면 빈 배열 리턴
- --

## 접근
- 루프를 돌면서 l과 r의 인덱스를 찾아 배열을 복사
  - Arrays.copyOf(), Arrays.copyOfRange()
- --

## 회고
- 처음 내가 생각했던 방식은 문자열 배열을 조인하여 indexOf로 인덱스 값을 찾은 뒤
  System.arraycopy() 메서드로 배열을 복사하려고 했음.
- 하지만 테스트 케이스가 깨지고, ArrayIndexOutOfBoundsException 예외 터짐
- 생각해보니 루프를 돌면서 l과 r에 대한 인덱스를 간단하게 찾을 수 있었음..