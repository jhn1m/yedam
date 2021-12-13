package com.yedam.java.test02;

public class TossCard extends Card {
	String company;
	String cardStaff;

	TossCard(String cardNo, int validDate, int CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
		company = "Toss";
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, " + getCardNo() + "\n담당직원 - " + cardStaff + ", " + company);
	}

}
