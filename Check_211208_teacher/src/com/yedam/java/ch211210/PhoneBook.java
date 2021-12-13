package com.yedam.java.ch211210;

import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone[] list;
		System.out.print("인원수 >> ");
		int num = sc.nextInt();
		list = new Phone[num];
		for (int i = 0; i < list.length; i++) {
			System.out.println("이름과 전화번호(빈칸없이 입력)");
			String name = sc.next();
			String tel = sc.next();
			list[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");

		while (true) {
			System.out.print("검색할 이름 >>");
			String name = sc.next();
			for (int i = 0; i < list.length; i++) {
				if (name.equals(list[i].getName())) {
					System.out.println(name + "의 번호는 " + list[i].getTel());
				} else if ((i + 1) == list.length) {
					System.out.println(name + "이 없습니다.");
				}
			}

		}

	}
}
