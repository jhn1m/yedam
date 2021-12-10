package com.yedam.java.ch02;

public interface Scheduler {

	// 대기열에 전화를 가져오는 방법 > 상담원
	public void getNextCall();

	// 대기열의 전화를 배분하는 방법 > 관리자
	public void sendCallToAgent();

}
