package com.yedam.java.test;

public class Customer {
	// 문제1) 아침 출근길에 김 씨는 4,000원을 내고 별다방에서 아메리카노를 마셨습니다.
	// 이 씨는 콩다방에서 4,500원을 내고 라떼를 사 마셨습니다.
	// 이 과정을 구현해보세요.

	String name;
	String place;
	String coffee;
	int money;
	int cost;
	

	Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void buy(Americano americano) {
		this.cost = americano.cost;
		this.money -= americano.cost;
		this.place = americano.cafeName;
		coffee = americano.coffee;
	}

	public void buy(Latte latte) {
		this.cost = latte.cost;
		this.money -= latte.cost;
		this.place = latte.cafeName;
		coffee = latte.coffee;
	}

	public void showInfo() {
		System.out.println(this.name + "는 " + cost + "원을 내고 " + place + "에서 " + coffee + "를 사 마셨습니다.");
	}
}
