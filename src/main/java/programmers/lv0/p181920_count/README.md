# p181920 - 카운트 업

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181920
- --

## 요약
정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return
- --

## 접근
- 순차적으로 1이 증가되므로 end_num - start_num을 해준 뒤 + 1 을 한다.(start_num 포함, end_num도 포함이므로)
- 해당 값을 사용하여 answer 배열을 초기화 한다
- 루프를 돌려 start_num ~ end_num 까지의 숫자를 배열에 담는다
- -- 

## 회고
- 길이를 먼저 계산 한 후 배열을 초기화 함.
- start_num과 end_num을 for 문 인자값으로 바로 사용해도 괜찮을 것 같음
  - ex) for(int i = start_num; i <= end_num; i++)