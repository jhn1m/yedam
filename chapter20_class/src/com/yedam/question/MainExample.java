package com.yedam.question;

public class MainExample {

	public static void main(String[] args) {
		Account account = new Account("홍길동", 10000);
		account.deposit(5000);
		account.withdraw(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		account.withdraw(10000);
	}

}
