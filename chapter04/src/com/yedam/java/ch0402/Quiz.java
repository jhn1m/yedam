package com.yedam.java.ch0402;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Quiz2();
		Quiz3();
		Quiz4();
		Quiz5();
		Quiz6();
		Quiz7();
	}

	// 2. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의
	// 총합을 구하는 코드를 작성해보세요.
	private static void Quiz2() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	// 3. while문과 Math.random() 메소드를 이용해서 2개의
	// 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로
	// 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
	// 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
	// 눈의 합이 5가 되는 조합은 (1, 4), (4, 1), (2, 3), (3, 2)

	private static void Quiz3() {
		int a, b;
		while (true) {
			a = (int) (Math.random() * 6);
			b = (int) (Math.random() * 6);
			System.out.println("a의 값은 " + a + " b의 값은 " + b);

			if ((a + b) == 5) {
				System.out.println("눈의 합이 5입니다.");
				break;
			} else {
				System.out.println("주사위를 다시 던집니다");
			}
		}
	}

	// 4. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를
	// 구해서 (x, y) 형태로 출력해보세요. 단, x와 y는 10이하의
	// 자연수입니다.

	private static void Quiz4() {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("x값 : " + x + " y값 : " + y);
				}
			}
		}
	}

	// 5. for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세요

	private static void Quiz5() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 6. 5번을 반대방향으로 출력하기

	private static void Quiz6() {
		
//		교수님 방식 > printf로 뒤에서부터 채우기
//		String tree= "";
//		for(int i = 1; i <= 4; i++) {
//			tree += "*";
//			System.out.printf("%4s\n", tree);
//		}
		
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println("");
		}
	}
	
	// 7. while문과 Scanner를 이용해서 키보드로 입력된
	// 데이터로 예금, 출금, 조회, 종료 기능을 제공하는
	// 코드를 [] 에 작성해 보세요. 프로그램을 실행하면
	// 다음과 같은 실행결과가 나와야 합니다
	// (Scanner의 nextLine() 사용).
	
	private static void Quiz7() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("예금액 > ");
				balance = sc.nextInt();
				break;
			case 2:
				System.out.print("출금액 > ");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.print("잔고 > " + balance + "\n");
				break;
			case 4:
				System.out.println("\n프로그램 종료");
				break;
			default:
				System.out.println("다시 입력하세요.");
				break;
			}
			sc.close();
		}
	}
	
	

}
