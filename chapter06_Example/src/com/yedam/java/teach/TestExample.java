package com.yedam.java.teach;

public class TestExample {
	public static void main(String[] args) {
		Person kim = new Person("Kim", 8000);
		Person lee = new Person("Lee", 9800);

		StarCafe starCafe = new StarCafe("별다방 1호점");
		kim.buyCoffeee(starCafe);
		starCafe.showInfo();

		BeanCafe beanCafe = new BeanCafe("콩다방 동성로점");
		lee.buyCoffeee(beanCafe);
		beanCafe.showInfo();

		kim.showInfo();
		lee.showInfo();

		//

		System.out.println();

		Card kbCard = new Card();
		Card kdbCard = new Card();
		System.out.println("kbCard : " + kbCard.getCardNumber());
		System.out.println("kdbCard : " + kdbCard.getCardNumber());

		//

		CardCompany company = CardCompany.getInstance();
		Card first = company.createCard();
		Card second = company.createCard();
		System.out.println("첫번째 : " + first.getCardNumber());
		System.out.println("두번째 : " + second.getCardNumber());
	}
}
