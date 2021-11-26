package com.yedam.java.teach;

public class CardCompany {

	// 필드
	private static CardCompany instance = new CardCompany();

	// 생성자
	private CardCompany() {

	}
	// 메소드
	public static CardCompany getInstance() {
		return instance;
	}
	
	public Card createCard() {
		return new Card();
	}
	
}
