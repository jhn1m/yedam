package com.yedam.java.test;

// 문제3) 문제2에서 구현한 내용에 카드 회사 클래스 CardCompany를 싱글톤 패턴을 사용하여 구현해보세요.
public class CardCompany {
	private static CardCompany instance = new CardCompany();

	private CardCompany() {

	}

	public static CardCompany getInstance() {
		return instance;
	}

	public Card2 createCard() {
		return new Card2();
	}

}
