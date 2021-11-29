package com.yedam.java.ch02_02;

public class KumhoTire extends Tire {

	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		accumulatioedRotation++;
		if (accumulatioedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation - accumulatioedRotation) + " 회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}