package com.yedam.question;

public class Account {
	private String owner;
	private long balance;
	private long amount;

	Account() {

	}

	Account(String owner) {
		this.owner = owner;
	}

	Account(long balance) {
		this.balance = balance;
	}

	Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long deposit(long amount) {
		this.balance += amount;
		return this.balance;
	}

	public long withdraw(long amount) {
		if (this.balance < amount) {
			System.out.println("잔액이 " + (amount - balance) + " 부족합니다.");
		} else {
			this.balance -= amount;
		}
		return this.balance;
	}

}
