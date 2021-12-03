package com.yedam.java.library;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {
		Library library = new Library();
		String name = null;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1. 책 정보 입력 | 2. 전체 조회 | 3. 단건 조회 | 4. 책 대여 | 5. 책 반납 | 6. 인기순위 | 7. 종료 ");
			System.out.println("선택 > ");
			int menuNo = sc.nextInt();

			switch (menuNo) {
			case 1:
				System.out.println("책 정보 > ");
				name = sc.next();
				String author = sc.next();
				library.addBook(name, author);
				break;
			case 2:
				library.printBookList();
				break;

			case 3:
				System.out.println("책 이름 >");
				name = sc.next();
				library.selectBookInfo(name);
				break;
			case 4:
				System.out.println("책 이름 >");
				name = sc.next();
				library.rentalBook(name);
				break;
			case 5:
				System.out.println("책 이름 >");
				name = sc.next();
				library.rentalBook(name);
				break;
			case 6:
				library.showRank();
				break;
			case 7:
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
