package com.yedam.java.test02;

public class DGBCard extends Card {
	String company;
	String cardStaff;

	DGBCard(String cardNo, int validDate, int CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
		company = "대구은행";
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO, " + getCardNo() + ", 유효기간 : " + getValidDate() + ", CVC : " + getCVC()
				+ " )\n담당직원 - " + cardStaff + ", " + company);
	}
}
