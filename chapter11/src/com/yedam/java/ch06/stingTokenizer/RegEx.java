package com.yedam.java.ch06.stingTokenizer;

public class RegEx {

//	정규 표현식 : 문자열이 일정한 패턴을 가지는 표현식
//	[] : 한개의 문자 
//	[abc] : a, b, c 중 하나의 문자
//	[^abc] : a, b, c 이외의 하나의 문자
//	[a-zA-z] : a~z, A~z 중 하나의 문자
//	\d : 한 개의 숫자, [0-9]와 동일
//	\s : 공백
//	\w : 한 개의 알파벳 또는 한개의 숫자, [a-zA-Z0-9]와 동일
//	? : 없음 또는 한 개
//	* : 없음 또는 한 개 이상
//	+ : 한 개 이상
//	{n} : 정확히 n개가 들어감
//	{n,} : 최소한 n개
//	{n, m} : n개에서 부터 m개 까지
//	() : 그룹핑

//	예를 들어, 02-123-1234 또는 010-1234-5678
//	(02|010)-\d{3,4}-\d{4}
//	구문분석
//	1) (02|010)
//	2) -
//	3) \d{} 3~4자리의 숫자
//	4) -
//	5) \d{} 4자리의 숫자

//	예를 들어, white@naver.com
//	\w+@\w+\.\w+(\.\w+)?
//	구문 분석
//	1) \w+
//	2) @
//	3) \w+
//	4) \.
//	5) \w+
//	6) (\.\w+)?
}