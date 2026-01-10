# p181908 - 접미사인지 확인하기

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181908
- --

## 요약
"banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"<br/>
문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return하는 메서드 구현
- --

## 접근
- is_suffix 문자열이 my_string의 접미사 배열에 포함되는지 확인해야 함
- 우선적으로 입력받은 문자열을 substring으로 잘라서 접미사 배열로 만든다
- 루프를 돌면서 두 번째 파라미터로 받은 문자열이 접미사 배열에 포함된다면 1, 아니라면 0 리턴
- --

## 회고
- 접미사 배열을 만들고 해당 배열에서 특정 문자열을 찾기 위해 if문을 사용함.
- 배열을 List로 변환 후 contains 메서드 사용해도 될 듯