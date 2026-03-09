# p42576 - 완주하지 못한 선수

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42576
- --

## 요약
마라톤에 참여한 선수들의 이름이 담긴 문자열 배열과<br/>
완주한 선수들의 이름이 담긴 문자열 배열이 주어질 때, 완주하지 못한 선수의 이름들 리턴하는 메서드 구현<br/>
단, 참가자 중 동명이인이 있을 수 있다.
- --

## 접근
- 선 정렬 후 같은 인덱스끼리 비교한다
- HashMap 사용
  - participant 원소를 map에 put하면서 value 값으로 + 1한 값을 세팅
  - completion 배열에 존재하는 원소들을 key로 가지고, 기존에 이미 put된 completion[i] key가지는 value에 -1을 한 값을 put한다.
    - 존재하는 값에 대하여 -1처리
  - value가 최종적으로 1인 값이 완주하지 못한 선수
- -- 

## 회고
- 이중 for문을 사용하려했어.
- 사용하면 같은 인덱스 값과 비교해야 하는데 다른 인덱스와 비교하다가 끊겨버렸어.
- 결국 단일 for문이면 충분
- 여기서 생각도 못했던 경우가 문제의 두 번째 예시(["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]).
- 위 두 배열의 같은 인덱스 값 중 다른 것을 발견하지 못했어. 
- 그러니까 if(!participant[i].equals(completion[i])) 이 코드가 전부 false로 떨어진거지
- 그렇기에 마지막에 ""을 리턴했어.
- 결국 participant 배열의 마지막 값을 리턴해줘야 해.
  - 왜? => completion 배열의 크기만큼 for문을 돌았고 문제에서 완주하지 못한 사람이 1명이라고 했어.
  - participant 배열의 마지막 원소가 완주하지 못한 사람이 되는겨 

- 해당 문제는 해시 개념을 통해서도 풀 수 있어.
  