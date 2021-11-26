package com.yedam.java.library;

public class Book {
	// 필드

	int BookNum; // 책번호
	String BookName; // 책이름
	String BookAuthor; // 지은이
	int BookTakeNum = 0; // 대여횟수
	boolean BookTake = false; // 대여유무

	// 생성자

	public Book(int BookNum, String BookName, String BookAuthor) {
		this.BookNum = BookNum;
		this.BookName = BookName;
		this.BookAuthor = BookAuthor;
	}

	// 메소드

	void BookTake(String BookName) {
		System.out.println(BookName + "책을 빌렸습니다.");
		BookTakeNum++;
		BookTake = true;
	}

	void isBookTake(String BookName) {
		if (this.BookTake == true) {
			System.out.println("현재 대여중인 책입니다.");
		} else {
			BookTake(BookName);
		}
	}

}
