package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {

		System.out.println("#####for문 기초#####\n");

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		int x = 1;
		for (; x <= 100; x++) {
		}

		int y;
		for (y = 0; y < 10; y--) {
		}

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ 100 합 : " + sum);
		System.out.println();

		sum = 0;
		int index = 0;
		for (index = 1; index <= 100; index++) {
			sum += index;
		}

		System.out.println("현재 index : " + index + ", sum : " + sum);
		System.out.println();
		System.out.println("#####float 타입 카운터 변수#####\n");

		// float 타입 카운터 변수
		for (float f = 0.1f; f <= 1.0f; f += 0.1f) {
			System.out.println(f);
		}

		System.out.println();
		System.out.println("#####구구단 출력 #####\n");
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "X" + n + "=" + (m * n));
			}
		}
		System.out.println();
		System.out.println("##### 1부터 10까지 출력 #####\n");

		int m = 1;
		while (m <= 10) {
			System.out.println(m);
			m++;
		}

		System.out.println();

		System.out.println("##### 1부터 100까지 합 출력 #####\n");

		sum = 0;
		index = 1;
		while (index <= 100) {
			sum += index;
			index++;
		}
		System.out.println("1 ~ " + (index - 1) + " 합 : " + sum);

		System.out.println();

		index = 1;
		while (index != 1) {
			System.out.println("while 반복문이 " + index + "번 실행됩니다.");
		}

		System.out.println();

		do {
			System.out.println("do~while 반복문이 " + index + "번 실행됩니다.");
		} while (index != 1);

		System.out.println();

		System.out.println("##### break로 while 종료하기 ##### \n");

		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}

		System.out.println();
		System.out.println("#####중첩 for문 연습#####\n");

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
			System.out.println("1) 안쪽 for문 종료");
		}
		System.out.println("2) 바깥쪽 for문 종료");

		System.out.println("##### coutinue을 사용한 for 문 #####\n");
		// 1부터 10 중에서 2의 배수에 해당되는 값을제외하고 출력
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}

	}
}