package com.yedam.java.test;

public class TestExample {

	public static void main(String[] args) {

		System.out.println("# 1번 문제");

		Customer kim = new Customer("김씨", 10000);
		Customer lee = new Customer("이씨", 10000);

		Americano americano = new Americano("별다방");
		Latte latte = new Latte("콩다방");
		lee.buy(americano);
		kim.buy(latte);

		lee.showInfo();
		kim.showInfo();

		System.out.println("# 2번 문제");
		Card ShinhanCard = new Card();
		Card KBCard = new Card();

		ShinhanCard.setCardName("신한카드");
		System.out.println(ShinhanCard.getCardName() + "의 카드 ID : " + ShinhanCard.getCardId());

		KBCard.setCardName("KB카드");
		System.out.println(KBCard.getCardName() + "의 카드 ID : " + KBCard.getCardId());

		System.out.println("# 3번 문제");
		CardCompany company = CardCompany.getInstance();
		Card2 singletonCard1 = company.createCard();
		Card2 singletonCard2 = company.createCard();
		System.out.println("싱글톤 카드1 : " + singletonCard1.getCardNum());
		System.out.println("싱글톤 카드2 : " + singletonCard2.getCardNum());
		
	}

}
