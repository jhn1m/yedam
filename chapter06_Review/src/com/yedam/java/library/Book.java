package com.yedam.java.library;

public class Book {
	// 필드
	public static int serialNum = 1000;
	int bookNum; // 책번호
	String bookName; // 책이름
	String bookAuthor; // 지은이
	public int rentalCnt = 0; // 대여횟수
	public boolean rental = false; // 대여유무

	// 생성자

	public Book() {

		Book.serialNum++;
		this.bookNum = Book.serialNum;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.rentalCnt = 0;
		this.rental = false;
	}

	// 메소드

	public static int getSerialNumber() {
		return serialNum;
	}

	public int getBookNo() {
		return bookNum;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void rentalCntUp() {
		this.rentalCnt++;
	}

	public int getRentalCnt() {
		return rentalCnt;
	}

	public void setRental(boolean rental) {
		this.rental = rental;
	}

	public boolean isRental() {
		return rental;
	}

	public void bookAdd(String bookName, String bookAuthor) {
		setBookName(this.bookName);
		setBookAuthor(this.bookAuthor);
	}

	void BookTake(String bookName) {
		System.out.println(bookName + "책을 빌렸습니다.");
		rentalCnt++;
		rental = true;
	}

	@Override
	public String toString() {

		String rental = this.rental ? "유" : "무";
		return "책 정보, 고유번호 : " + bookNum + ", 이름 : " + bookName + ", 지은이 : " + bookAuthor + ", 대여 : " + rental
				+ " 대여횟수 : " + rentalCnt;

	}

	void isBookTake(String BookName) {
		if (this.rental == true) {
			System.out.println("현재 대여중인 책입니다.");
		} else {
			BookTake(BookName);
		}
	}
}