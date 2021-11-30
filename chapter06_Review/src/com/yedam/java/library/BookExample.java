/*
	 중앙로 도서관에서 근무 중인 김씨의 오늘 업무일지는 다음과 같습니다. 

	 - 당일 들어온 책에 대해 입고처리
	 (참고1, 책마다 고유번호가 자동으로 부여됩니다. )
	 (참고2, 도서관에서 보유할 수 있는 책의 최대 수량은 5권입니다.)
	 	1) 혼자공부하는자바, 신용권      -> 정상입고
	 	2) 이것이자바다, 신용권	      -> 정상입고
	 	3) 자바스크립트파워북, 에이포스트  -> 정상입고
	 	4) 나는프로그래머다, 이상순      -> 정상입고
	 	5) 오늘부터개발자, 김용닥       -> 정상입고
	 	6) SQL의 비밀노트, 김예담      -> 보유수량 초과
	 - 현재 보유 중인 책 목록 확인
	 - 이용자가 요청한 책 정보 확인
	 	1) 이것이자바다
	 	2) 오늘부터개발자
	 - 책 대여
	 	1) 나는프로그래머다 -> 정상대여
	 	2) 혼자공부하는자바 -> 정상대여
	 	3) 나는프로그래머다 -> 대여 중
	 - 책 반납
	 	1) 혼자공부하는자바
	 - 대여횟수를 기준으로 인기순위를 확인하여 추가구입여부 결정
	 */

package com.yedam.java.library;

public class BookExample extends Library {
	public static void main(String[] args) {
		Library library = new Library();
		library.printBookList();

		Book book1 = new Book();
		book1.setBookName("혼자공부하는자바");
		book1.setBookAuthor("신용권");
//		bookList[0] = book1.getBookName();
	}
}
