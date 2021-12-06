package com.yedam.java.ch04;

public class Account {
	private long balance;

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withDraw(int money) throws BalanceInsufficientException {
		if (money > balance) {
			throw new BalanceInsufficientException("잔고 부족 : " + (money - balance) + "이 모자랍니다.");
		} else {
			balance -= money;
		}
	}

}
