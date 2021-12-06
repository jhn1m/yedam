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

		System.out.println();

		// 문자추출, charAt();
		String ssn = "010624-1230123";
		char gender = ssn.charAt(7); // 인덱스번호

		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
		}

		// 바이트 배열로 변환, getBytes()
		String str = "안녕하세요";
		byte[] bytesX = str.getBytes();
		System.out.println("bytesX.length : " + bytesX.length);
		String strX = new String(bytesX);
		System.out.println("bytesX -> strX : " + strX);

		try {
			byte[] bytesY = str.getBytes("UTF-8");
			System.out.println("bytesY.length : " + bytesY.length);
			String strY = new String(bytesY, "UTF-8");
			System.out.println("bytesY -> strY : " + strY);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
