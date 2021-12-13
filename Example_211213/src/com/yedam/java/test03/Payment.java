package com.yedam.java.test03;

public interface Payment {
	double ONLINE_PAYMENT_RATIO = 0.05;
	double OFFLINE_PAYMENT_RATIO = 0.03;

	public int online(int price);

	public int offline(int price);

	public void showinfo();

}
