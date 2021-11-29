package com.yedam.java.library;

public class Library {

	// 필드
	private static final int MAX_SIZE = 5;
	private Book[] bookList;
	private int bookCount;

	// 생성자
	public Library() {
		this.bookList = new Book[MAX_SIZE];
		this.bookCount = 0;
	}
	// 메소드

	// 3. 책에 대한 입고처리

	// 1. 현재 보유중인 책 정보 확인
	public void printBookList() {
		for (int i = 0; i < this.bookCount - 1; i++) {
			System.out.println(bookList[i]);
		}
	}

	// 2. 지정된 책 정보 확인
	public void printBook() {

	}

	// 4. 책 대여
	public void rental() {

	}
	// 5. 책 반납

	// 6. 대여횟수를 기준으로 인기순위 확인
}
