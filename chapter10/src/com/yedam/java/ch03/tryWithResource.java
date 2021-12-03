package com.yedam.java.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class tryWithResource {
	public static void main(String[] args) {
		// try - with - resource 문

//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("a.txt");
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//			return;
//		} finally {
//			if (fis != null) {
//				try {
//					fis.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			System.out.println("항상 수행됩니다.");
//		}
//		System.out.println("여기도 수행됩니다.");

		// try - with - resource문
		try (FileInputStream is = new FileInputStream("a.txt")) {
		} catch (IOException e) {
			System.out.println("예외부분입니다.");
		}

		// try 괄호 안에 사용할 리소스를 선언
		try (AutoCloseObj obj = new AutoCloseObj()) {
			// 리소스를 이용하는 실행문

			throw new Exception(); // 강제로 예외 실행.
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}

	}
}
