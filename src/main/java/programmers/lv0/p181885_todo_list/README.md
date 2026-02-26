# p181885 - 할 일 목록

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181885
- --

## 요약
문자열 배열과 boolean 배열이 주어질 때,<br/>
문자열 배열에서 마치지 못한 일들을 순서대로 담은 문자열 배열을 리턴하는 메서드 구현
- --

## 접근
- 해야할 일과 flag 배열과 key-value 쌍을 지어준다(Map)
- 루프를 돌면서 key값에 해당하는 value를 뽑아내고 이 값이 false 일 때만 배열에 담는다
- 이후 Arrays.copyOf() 메서드로 배열 정리하여 리턴
- --

## 회고
- 생각해보면 todoList와 finished는 이미 인덱스로 매칭되고 있어
- => Map을 사용할 필요가 없었네
- 게다가 LinkedHashMap은 전혀 필요 없었음. 순서를 사용하지 않았어
- 인덱스로 충분히 접근이 가능한 상태. => 인덱스로 매칭되고 있으니까 
- Map을 사용하기엔 좀 과한 듯..