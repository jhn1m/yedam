package com.yedam.java.review;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class Review {

	public static void main(String[] args) {
		quiz4();
	}

	private static void quiz1() {
		// 문제1) 세 수를 입력받아 차례대로 두 수와 사칙연산을 이용하여 나머지 수를 구한다고 했을 때 어떤 연산식이 되는 지 구현하세요.
		// 예를 들어, 2, 3, 5를 입력받았을 경우 2 + 3 = 5 를 출력하세요.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("첫번째 수를 입력하세요 > ");
			int a = Integer.parseInt(sc.nextLine());
			System.out.print("두번째 수를 입력하세요 > ");
			int b = Integer.parseInt(sc.nextLine());
			System.out.print("세번째 수를 입력하세요 > ");
			int c = Integer.parseInt(sc.nextLine());

			if (a + b == c) {
				System.out.println(a + " + " + b + " = " + c);
			} else if (a - b == c) {
				System.out.println(a + " - " + b + " = " + c);

			} else if (a * b == c) {
				System.out.println(a + " X " + b + " = " + c);

			} else if (a / b == c) {
				System.out.println(a + " / " + b + " = " + c);

			} else {
				a = 0;
				b = 0;
				c = 0;
				System.out.println("다시 입력하세요.");
			}
		}
	}

	private static void quiz2() {
		// 문제2) 두 수를 입력받아 두수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요.
		// 메뉴는 아래와 같이 구성합니다.
		// input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료
		Scanner sc = new Scanner(System.in);

		System.out.println("input 숫자입력 | +. 더하기 | *. 곱하기 | /. 나누기 | ?. 대소관계 | exit. 종료");

		System.out.print("첫번째 숫자를 입력하세요 > ");
		int input1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자를 입력하세요 > ");
		int input2 = Integer.parseInt(sc.nextLine());
		sc.close();
		System.out.println("더하기");
		System.out.printf("%d + %d = %d \n", input1, input2, input1 + input2);
		System.out.println("빼기");
		System.out.printf("%d - %d = %d \n", input1, input2, input1 - input2);
		System.out.println("곱하기");
		System.out.printf("%d * %d = %d \n", input1, input2, input1 * input2);
		System.out.println("나누기");
		System.out.printf("%d / %d = %d \n", input1, input2, (input1 / input2));
		if (input1 > input2) {
			System.out.printf("%d 와 %d 중 더 큰 수는 %d 입니다. \n", input1, input2, input1);
		} else if (input1 < input2) {
			System.out.printf("%d 와 %d 중 더 큰 수는 %d 입니다. \n", input1, input2, input2);
		} else {
			System.out.println("두 수의 값이 동일합니다. \n");
		}

	}

	private static void quiz3() {
		// 문제 3) 입력한 수만큼 주사위(1~6)를 굴려서 나온 수들 중 최고 수와 최저 수, 수들의 합을 구하는 프로그램을 구현하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("굴리려는 주사위의 횟수? > ");
		int cnt = Integer.parseInt(sc.nextLine());
		sc.close();
		int[] diceSum = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			int diceNum = (int) (Math.random() * 6 + 1);
			diceSum[i] += diceNum;
		}
		int max = diceSum[0];
		for (int i = 0; i < diceSum.length; i++) {
			if (diceSum[i] > max) {
				max = diceSum[i];
			}
		}
		Arrays.sort(diceSum);
		int min = diceSum[0];
		int sum = 0;
		for (int i = 0; i < diceSum.length; i++) {
			sum += diceSum[i];
		}

		System.out.println("최고 수 : " + max);
		System.out.println("최저 수 : " + min);
		System.out.println("수들의 합 : " + sum);

	}

	private static void quiz4() {
		// 문제4) 로또 번호를 구하는 프로그램을 작성하세요.

		int[] lotto = { 1, 2, 3, 4, 5, 6 }; // 무작위 로또 생성
		int first = (int) Math.random() * 10 + 1;
		int sec = (int) Math.random() * 10 + 1;
		int third = (int) Math.random() * 10 + 1;
		int four = (int) Math.random() * 10 + 1;
		int five = (int) Math.random() * 10 + 1;
		int six = (int) Math.random() * 10 + 1;
		int cnt = 0;
		boolean run = true;
		while (run)
			if (first == lotto[0]) {
				if (sec == lotto[1]) {
					if (third == lotto[2]) {
						if (four == lotto[3]) {
							if (five == lotto[4]) {
								if (six == lotto[5]) {
									System.out.println("로또까지 총 " + cnt + "번 걸렸습니다.");
									run = false;
								} else {
									cnt++;
								}
							}
						}
					}
				}
			}

	}

	private static void teach1() {
		Scanner sc = new Scanner(System.in);

		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		int z = Integer.parseInt(sc.nextLine());

		if (x + y == z) {
			System.out.printf("%d + %d = %d", x, y, z);
		} else if (x - y == z) {
			System.out.printf("%d - %d = %d", x, y, z);
		} else if (x * y == z) {
			System.out.printf("%d X %d = %d", x, y, z);
		} else if (x / y == z) {
			System.out.printf("%d / %d = %d", x, y, z);
		} else {
			System.out.println("성립하는 연산식이 없습니다.");
		}

	}

	private static void teach2() {
		Scanner sc = new Scanner(System.in);

		int x = 0;
		int y = 0;

		boolean run = true;

		while (run) {
			System.out.println("input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료");
			System.out.println("수행해야 할 명령을 입력하세요.");
			String menu = sc.nextLine();
			switch (menu) {
			case "input":
				x = Integer.parseInt(sc.nextLine());
				y = Integer.parseInt(sc.nextLine());
				break;
			case "+":
				System.out.printf("%d + %d = %d", x, y, x + y);
				break;
			case "-":
				System.out.printf("%d - %d = %d", x, y, x - y);
				break;
			case "*":
				System.out.printf("%d * %d = %d", x, y, x * y);
				break;
			case "/":
				System.out.printf("%d / %d = %d", x, y, x / y);
				break;
			case "?":
				if (x > y) {
					System.out.printf("%d 가 %d 보다 작습니다.", y, x);
				} else if (x < y) {
					System.out.printf("%d 가 %d 보다 큽니다.", y, x);
				} else {
					System.out.printf("%d와%d는 같습니다.", y, x);
				}
				break;
			case "exit":
				run = false;
				System.out.println("프로그램 종료");
			default:
				System.out.println("일치하는 연산자가 없습니다.");
			}
		}

	}

	private static void teach3() {

	}

	private static void teach4() {

	}

}
