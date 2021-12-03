package com.yedam.java.teach;

public class Card {
	// 필드

	private static int serialNum = 1000;
	private int cardNumber;

	// 생성자

	public Card() {
		Card.serialNum++;
		this.cardNumber = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Card.serialNum = serialNum;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	// 메소드
}
