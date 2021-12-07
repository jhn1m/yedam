package com.yedam.java.ch06.stingTokenizer;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class MainExample {

	public static void main(String[] args) {
		// 문자열이 특정 구분자로 연결되어 있을 경우
		// 구분자를 기준으로 부분 문자열로 분리하는 방법

		// String.split() -> 정규표현식 , 배열형태
		System.out.println("split()");
		String text1 = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text1.split("& | , | -");
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("StringTokenizer() \n");

		// StringTokenizer 클래스 -> 문자, 토큰형태
		StringTokenizer st = new StringTokenizer(text1, "&:,:-");
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		System.out.println();

		String text2 = "홍길동/이수홍/박연수";
		st = new StringTokenizer(text2, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

		// StringBuilder
		StringBuilder sb = new StringBuilder();

		// 문자열을 끝에 추가
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println("\n" + sb.toString() + "\n");

		// index 4 앞에 "2"를 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString() + "\n");

		// index 4 위치의 문자를 '6'으로 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString() + "\n");

		// index 6부터 index 13 '전' 까지를 "Book" 문자열로 대치
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString() + "\n");

		// index 4부터 index 5 '전' 까지를 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString() + "\n");

		// 총 문자 수 얻기
		int length = sb.length();
		System.out.println("총 문자수 : " + length + "\n");

		// String으로 변환
		String result = sb.toString();
		System.out.println(result + "\n");

		// Pattern
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean resultData = Pattern.matches(regExp, data);
		if (resultData) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom"; // .이 빠져있음
		resultData = Pattern.matches(regExp, data);
		if (resultData) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

	}
}