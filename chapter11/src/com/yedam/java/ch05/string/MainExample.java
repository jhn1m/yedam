package com.yedam.java.ch05.string;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class MainExample {

	public static void main(String[] args) throws IOException {
		//
//		byte[] bytes1 = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
//		String str1 = new String(bytes1);
//		System.out.println(str1);
//
//		String str2 = new String(bytes1, 6, 4);
//		System.out.println(str2);
//
//		byte[] bytes2 = new byte[100];
//		System.out.println("입력 > ");
//		int readByteNo = System.in.read(bytes2);
//
//		String str3 = new String(bytes2, 0, readByteNo - 2);
//		System.out.println(str3);

		// 문자추출, charAt();
		String ssn = "010624-1230123";
		char gender = ssn.charAt(7); // 인덱스번호

		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자입니다. \n");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다. \n");
		}

		// 바이트 배열로 변환, getBytes()
		String str = "안녕하세요";
		byte[] bytesX = str.getBytes();
		System.out.println("bytesX.length : " + bytesX.length);
		String strX = new String(bytesX);
		System.out.println("bytesX -> strX : " + strX + "\n");

		try {
			byte[] bytesY = str.getBytes("UTF-8");
			System.out.println("bytesY.length : " + bytesY.length);
			String strY = new String(bytesY, "UTF-8");
			System.out.println("bytesY -> strY : " + strY + "\n");

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// 문자열 찾기, indexOf()
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println("문자열이 처음으로 시작하는 위치 : " + location + "\n");

		// 해당하는 문자열이 있는지 체크
		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책\n");
		} else {
			System.out.println("자바와 관련없는 책\n");
		}

		// 문자열 길이, length()
		String koreaSsn = "7306241230123";
		int length = koreaSsn.length();
		if (length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.\n");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.\n");
		}

		// 문자열 잘라내기, subString();
		String firstNum = koreaSsn.substring(0, 6);
		System.out.println(firstNum + "\n");

		String secondNum = koreaSsn.substring(6);
		System.out.println(secondNum + "\n");

		// 알파벳 소문자 변경 : toLowerCase()
		// 알파벳 대문자 변경 : toUpperCase()
		String str4 = "Java Programming";
		String str5 = "JAVA Programming";

		// 대소문자 구분
		System.out.println(str4.equals(str5) + "\n");

		// 소문자로 변경 후 같음
		String lowerStr4 = str4.toLowerCase();
		String lowerStr5 = str5.toLowerCase();
		System.out.println(lowerStr4.equals(lowerStr5) + "\n");

		// 대소문자 구분없이 순수하게 뜻만 같다면 true
		System.out.println(str4.equalsIgnoreCase(str5) + "\n");

		// 문자열 앞 뒤 공백 잘라내기, trim()
		String tel1 = "     02";
		String tel2 = "123     ";
		String tel3 = "       1234";

		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel + "\n");

		// 문자열 변환, valueOf
		String strVar3 = String.valueOf(10);
		String strVar4 = String.valueOf(10.5);
		String strVar5 = String.valueOf(true);

		System.out.println(strVar3);
		System.out.println(strVar4);
		System.out.println(strVar5 + "\n");

	}

}
