# p86491 - 최소 직사각형

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/86491
- --

## 요약
명함의 크기, width와 height가 2차원 배열로 주어질 때,<br/>
모든 명함을 수납할 수 있는 가장 작은 지갑의 크기를 리턴하는 메서드 구현 
- --

## 접근
- 2차원 배열을 루프를 돌리면서 각 width와 height 값을 뽑아냄.
- width보다 height가 더 크다면 둘의 값을 스왑한다.
- 이후 width별 Max, height Max 값을 뽑아낸다.
- -- 

## 회고
- 문제를 이해하는데 힘들었음.
- 서치해서 이해한 결과 가로 길이와 세로 길이 중 세로 길이가 더 길다면
  가로와 세로의 값을 교환한 뒤 가로, 세로 Max값을 뽑아내는 문제