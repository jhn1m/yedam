package com.yedam.java.ch05.string;

public class Quiz {
	public static void main(String[] args) {
		System.out.println(initcap("hello"));
		System.out.println(initcap("javaprogramming"));
		System.out.println(printInversion("Hello"));
		System.out.println(printInversion("JavaProgramming"));
	}

	public static String initcap(String str) {
		// 매개변수로 받은 문자열에서 각 단어의 첫번째 글자만 대문자로 변환해서 반환
		// 예를 들어, hello -> Hello
		System.out.println("initcap 실행 " + str);
		String firstStr = str.substring(0, 1);
		str = str.substring(1, str.length());
		firstStr = firstStr.toUpperCase();
		str = firstStr + str;
		return str;
	}

	public static String printInversion(String str) {
		// 매개변수로 받은 문자를 뒤집어서 반환
		// 예를 들어, hello -> olleh
		System.out.println("printInversion 실행 " + str);
		String data = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			data += str.charAt(i);
		}
		return data;
	}

}