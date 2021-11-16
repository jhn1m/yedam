package com.yedam.java.ch0204;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 수 : ");
		String strNum1 = String.valueOf(sc.nextInt());
		System.out.println("두번째 수 : ");
		String strNum2 = String.valueOf(sc.nextInt());

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : ");
		String name = sc.next();
		System.out.print("2. 주민번호 앞 6자리 : ");
		int pNum = sc.nextInt();
		System.out.print("3. 전화번호 : ");
		String phoneNum = sc.next();

		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(pNum);
		System.out.print(phoneNum);

	}

}
