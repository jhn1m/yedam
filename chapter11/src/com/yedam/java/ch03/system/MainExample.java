package com.yedam.java.ch03.system;

public class MainExample {

	public static void main(String[] args) {

		// 보안관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException();
				}
			}
		});

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
//				System.exit(i);
			} catch (SecurityException e) {
				System.out.println("정상적으로 종료되지 않았습니다.");
			}
		}
		// 현재시각 읽기
		// - currentTimeMills() : 밀리세컨드 (1/1000초) 단위
		// - nanoTime() : 나노세컨드(1/10^9초) 단위

		long time1 = System.nanoTime();
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += 1;
		}
		long time2 = System.nanoTime();
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에 " + (time2 - time1) + "나노초가 소모되었습니다.");
	}

}
