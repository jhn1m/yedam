package com.yedam.java.ch01;

public interface RemoteControl {

	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// 추상메서드
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	/***
	 * default 메소드
	 * 
	 * 추상메소드가 아닌 인스턴스 메소드므로 구현객체가 있어야 사용할 수 있다. 인터페이스의 모든 구현 객체가 가지고 있는 기본 메소드 > 메소드
	 * 재정의도 가능
	 ***/
	
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	/*
	 * 정적메소드
	 * 클래스 생성과 무관하게 사용
	 */
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
