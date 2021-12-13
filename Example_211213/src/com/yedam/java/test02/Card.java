package com.yedam.java.test02;

public class Card {
	String cardNo;
	int validDate;
	int CVC;

	protected Card(String cardNo, int validDate, int CVC) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.CVC = CVC;
	}

	public String getCardNo() {
		return cardNo;
	}

	public int getValidDate() {
		return validDate;
	}

	public int getCVC() {
		return CVC;
	}

	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO : " + getCardNo() + ", 유효기간 : " + getValidDate() + ", CVC : " + getCVC());
	}


}
