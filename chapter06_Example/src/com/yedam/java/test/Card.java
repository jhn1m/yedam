package com.yedam.java.test;

//문제2) 카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해줍니다.
//카드가 생성될 때마다 카드 번호가 자동으로 증가할 수 있도록 카드 클래스를 만들고 생성해보세요.
public class Card {
	private static int serialNum = 100;

	private int cardId;
	private int cardNum;
	private String cardName;

	public Card() {
		Card.serialNum++;
		this.cardId = serialNum;
		this.cardNum = serialNum + 1;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Card.serialNum = serialNum;

	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getCardNum() {
		return cardNum;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

}
