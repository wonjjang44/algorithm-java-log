# p181928 - 이어 붙인 수

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181928
- --

## 요약
정수 배열 num_list에 홀수만 순차적으로 이어 붙인 수와 짝수만 순차적으로 이어 붙인 수의 합을<br/>
return 하는 메서드 구현
- --

## 접근
- 정수 배열만큼 반복하면서 %2 == 0 일 경우(짝수)와 아닐 경우(홀수)를 나눠서 원소를 뽑아낸다.
- 문자열로 더한 후 이를 int로 형변환하여 합한다.
- -- 

## 회고
- for문을 돌면서 각각의 StringBuilder에 append 했는데 선언한 sumResult 변수가 아무 작업도 하지 않음.
- 삼항 연산자를 (j % 2 == 0 ? evenNum : oddNum).append(j); 이런식으로 사용해도 될 듯