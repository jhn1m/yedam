package com.yedam.java.library;

public class Library {

	// 필드
	private static final int MAX_SIZE = 5;
	private Book[] bookList;
	private int bookCount; // bookList 현재 값 , bookList의 정보 수, 인덱스 역할

	// 생성자
	public Library() {
		this.bookList = new Book[MAX_SIZE];
		this.bookCount = 0;
	}
	// 메소드

	// 3. 책에 대한 입고처리

	public void addBook(String name, String author) {
		// 배열 사용 시 값을 확인해야 함.
		if (this.bookCount == Library.MAX_SIZE) {
			System.out.println("더 이상 책 정보를 입력할 수 없습니다.");
			return;
		}
		Book book = new Book(name, author);
		bookList[bookCount] = book;
		bookCount++;
		System.out.println("정상 입고 되었습니다.");

//		초기코드
//		for (int i = 0; i < bookList.length; i++) {
//			if (bookList[i] != null) {
//				book.setBookName(name);
//				book.setBookAuthor(author);
//				bookCount++;
//			} else {
//				System.out.println("보유수량 초과");
//			}
//		}
	}

	// 1. 현재 보유중인 책 정보 확인
	public void printBookList() {
		for (int i = 0; i < this.bookCount - 1; i++) {
			System.out.println(bookList[i]);
		}
	}

	// 2. 지정된 책 정보 확인
	public void selectBookInfo(String name) {
		for (int i = 0; i < this.bookCount; i++) {
			Book book = bookList[i];
			String bookName = book.getBookName();
			if (bookName.equals(name)) { // String일땐 equals, int일땐 == //
				System.out.println(book);
			} else {
				System.out.println("없는 책입니다.");
			}
		}
	}

	// 4. 책 대여
	public void rentalBook(String name) {
		selectBookInfo(name);
		for (int i = 0; i < this.bookCount; i++) {
			Book book = bookList[i];
			String bookName = book.getBookName();
			if (bookName.equals(name)) {
				if (!book.isRental()) {
					book.setRental(true);
					book.rentalCntUp();
//					book.BookTake(name);
					System.out.printf("책 %s이 대여되었습니다.\n", name);
				} else {
					System.out.printf("책 %s이 대여중입니다.\n", name);
				}
			}
		}
	}

	// 5. 책 반납 - returnBook
	public void returnBook(String name) {
		selectBookInfo(name);
		for (int i = 0; i < this.bookCount; i++) {
			Book book = bookList[i];
			String bookName = book.getBookName();
			if (bookName.equals(name)) {
				if (book.isRental()) {
					book.setRental(false);
//					book.rentalCntUp();
					System.out.printf("책 %s이 반납되었습니다.\n", name);
				}
			}
		}
	}

	// 6. 대여횟수를 기준으로 인기순위 확인
	public void showRank() {
		Book[] rank = new Book[bookCount];
		System.arraycopy(bookList, 0, rank, 0, bookCount); // 배열복사

		// 정렬
		for (int i = 0; i < rank.length - 1; i++) {
			for (int j = i + 1; j < rank.length; j++) {
				if (rank[i].getRentalCnt() < rank[j].getRentalCnt()) {
					Book temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
				}
			}
		}
		for (Book book : rank) {
			System.out.println(book);
		}
	}
}
