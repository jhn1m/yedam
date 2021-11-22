package com.yedam.java.ch0503;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Quiz2();
	}

	private static void Quiz1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------------------------");
		System.out.println("1. 상품 수 | 2. 가격입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료");
		System.out.println("---------------------------------------------------------------\n");

		int[] item = null;
		int itemCnt = 0;
		boolean run = true;
		while (run) {
			System.out.print("메뉴 번호를 입력하세요 > ");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.print("\n상품 수를 입력하세요 > ");
				itemCnt = sc.nextInt();
				item = new int[itemCnt];
				System.out.println();
			} else if (select == 2) {
				if (item.length > 0) {
					System.out.println("\n현재 상품 수는 " + itemCnt + "개 입니다.\n");

					for (int i = 0; i < item.length; i++) {
						System.out.print("가격을 입력하세요 > ");
						item[i] = sc.nextInt();
					}
					System.out.println();
				} else {
					System.out.println("상품 수가 0개 입니다.");
				}
			} else if (select == 3) {
				System.out.println("\n제품별 가격을 출력합니다.\n");
				if (item.length > 0) {
					for (int i = 0; i < item.length; i++) {
						System.out.println(i + 1 + "번째 상품의 가격은 " + item[i] + "원 입니다.");
					}
					System.out.println();
				} else {
					System.out.println("상품 수가 0개 입니다.");
				}
				System.out.println();
			} else if (select == 4) {
				System.out.println("\n분석\n");
				if (item.length > 0) {
					int max = item[0];
					for (int i = 0; i < item.length; i++) {
						if (item[i] > max) {
							max = item[i];
						}
					}
					int itemSum = 0;
					for (int i = 0; i < item.length; i++) {
						itemSum += item[i];
					}
					int maxName = 0;
					for (int i = 0; i < item.length; i++) {
						if (item[i] == max) {
							maxName = i + 1;
						}
					}
					System.out.println("최고 가격을 가진 제품은" + maxName + " 번 입니다.");
					System.out.println("해당 제품을 제외한 나머지의 합은 " + (itemSum - max) + "원 입니다.\n");
				} else {
					System.out.println("상품 수가 0개 입니다");
				}
			} else if (select == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}

	// 추가문제 A,E,I,O,U 를 모음이라고 가정했을 때
	// 입력으로 들어온 문자열이 몇개의 모음과 자음으로 구성되어 있는지
	// 출력하는 프로그램을 작성하세요.
	// 입력 예시
	// > 입력할 문자열의 개수 : 2
	// Programming is fun
	// Hello World
	// 출력 예시
	// Programming is fun : 5 11
	// Hello World : 3 7

	private static void Quiz2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 문자열의 개수 : ");
		int cnt = Integer.parseInt(sc.nextLine());
		int vowel = 0;
		int consonant = 0;
		String[][] str = new String[cnt][];
		for (int i = 0; i < str.length; i++) {
			String str3 = sc.nextLine();
			str[i] = new String[str3.length()];
			for (int j = 0; j < str3.length(); j++) {
				str[i][j] = str3.split("")[j];
			}
		}

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[j].length; j++) {
				if (str[j].equals("A") && str[j].equals("E") && str[j].equals("I") && str[j].equals("O")
						&& str[j].equals("U")) {
					vowel++;
				} else if (!str[j].equals(" ")) {
					consonant++;
				} else if(str[j].equals(" ")) {
					continue;
				}
			}
		}

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[j].length; j++) {
				System.out.println(str[i][j] + "의 모음은 " + vowel + "개" + "자음은 " + consonant + "개 입니다.");
			}
		}

		System.out.println(Arrays.deepToString(str));
	}

	private static void test() {
		Scanner sc = new Scanner(System.in);
		String str3 = sc.nextLine();
		String[] str = new String[str3.length()];
		for (int i = 0; i < str3.length(); i++) {
			str[i] = str3.split("")[i];
		}
		System.out.println(Arrays.toString(str));
	}

}