package com.yedam.app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("| 1. 사원정보 | 2. 부서정보 |");
		System.out.println("-----------------------------");
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		if (menuNo == 1) {
			new EmpFrame();
		} else if (menuNo == 2) {
			new DeptFrame();
		} else {
			System.out.println("다시 입력하세요.");
		}

	}
}
