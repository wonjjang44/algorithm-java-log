# p181932 - 코드 처리하기

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181932
- --

## 요약
- 문자열 code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 변경한다.<br/>
  mode에 따라 code를 읽어가면서 문자열 ret을 만듦.<br/>
  mode는 0과 1 존재.<br/>
  > mode가 0일 때<br/>
    code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가.<br/>
    code[idx]가 "1"이면 mode를 0에서 1로 바꿈.<br/>
    <br/>
    mode가 1일 때<br/>
    code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가.<br/>
    code[idx]가 "1"이면 mode를 1에서 0으로 바꿈.

  문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 메서드를 완성하되,<br/>
  mode 초기값은 0이며 ret이 "" 이라면 EMPTY 리턴
- --

## 접근
- 문제에 조건이 제시돼 있음
- 문자열을 문자('') 타입으로 변환(첫 번째 루프) 후 해당 문자 배열 만큼 반복하면서<br/>
  문제 나온 조건을 코드로 옮긴다.
- ret 값이 "" 이면 문자열 "EMPTY"을 담은 후 최종적으로 answer 변수에 담아 리턴한다.
- -- 

## 회고
- 문자열을 문자 배열로 생성할 떄 toCharArray() 메서드 사용 가능(리턴 타입은 char[])
- primitive 타입으로 char 배열을 생성하면 해당 char 원소들은 ASCII 코드를 가리킴
- 따라서 문자 1을 의미하는 49를 선언한 뒤 해당 값과 == 비교를 한다.
- 변경된 로직에서는 primitive타입이 아닌 Wrapper Character 을 사용하여<br/>
  오버라이드 된 equals를 사용하여 문자 1을 비교하는 로직으로 변경