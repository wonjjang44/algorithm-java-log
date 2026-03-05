# p12932 - 자연수 뒤집어 배열로 만들기

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12932
- --

## 요약
자연수 n을 뒤집어 정수 배열로 리턴하는 메서드 구현
- --

## 접근
- StringBuilder 클래스의 reverse() 메서드를 사용하여 뒤집은 다음 다시 루프를 돌면서 배열에 저장한다 
- -- 

## 회고
- StringBuilder의 reverse() 메서드를 사용한 방법은 아래와 같아 
  - 숫자를 문자로 변환하고, 다시 문자열 배열로 변환한 다음 다시 정수 배열로 리턴
  - 위 과정을 조금 더 줄일 수 없을까?
  - => for문 내부의 조건을 바꿔주면 어떨까?
  - for (int i = strArr.length - 1; i >= 0; i--)
    - 이렇게 하면 굳이 변환 작업을 통하지 않더라도 숫자를 뒤집어서 리턴할 수 있을 듯

