package com.yedam.java.teach;

public class Person {
	// 필드
	private String name;
	private int money;

	// 생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 메소드
	public void buyCoffeee(StarCafe starCafe) {
		starCafe.buyAmericano(4000);
		this.money -= 4000;
	}

	public void buyCoffeee(BeanCafe beanCafe) {
		beanCafe.buyLatte(4500);
		this.money -= 4500;
	}

	public void showInfo() {
		System.out.printf("%s의 남은 돈은 %d입니다. \n", name, money);
	}
}
