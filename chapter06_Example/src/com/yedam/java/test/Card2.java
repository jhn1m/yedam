package com.yedam.java.test;

public class Card2 {

	// 필드
	private static int serialNum = 100;
	private int cardNum;

	// 생성자
	public Card2() {
		Card2.serialNum++;
		this.cardNum = serialNum;
	}

	// 메소드
	public static void setSerialNum(int serialNum) {
		Card2.serialNum = serialNum;
	}

	public static int getSerialNum() {
		return Card2.serialNum;
	}

	public void setCardNum(int cardNumber) {
		this.cardNum = cardNumber;
	}

	public int getCardNum() {
		return cardNum;
	}

}
