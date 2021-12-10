package com.yedam.java.ch01;

public interface Calc {
	// 필드 > 상수
	// 인터페이스 자체는 상수만 가질 수 있으므로 final을 적지않아도 됨
	double PI = 3.14;
	int ERROR = -999999999;

	// 메서드 > 추상메서드
	// 마찬가지로 abstract가 없더라도 됨.
	int add(int x, int y);

	int minus(int x, int y);

	int multi(int x, int y);

	int divide(int x, int y);

}
