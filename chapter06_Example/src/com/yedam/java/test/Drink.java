package com.yedam.java.test;

public class Drink {

	public static void main(String[] args) {

		Customer kim = new Customer("김씨", 10000);
		Customer lee = new Customer("이씨", 10000);

		Americano americano = new Americano("별다방");
		Latte latte = new Latte("콩다방");
		lee.buy(americano);
		kim.buy(latte);

		lee.showInfo();
		kim.showInfo();

	}
}
