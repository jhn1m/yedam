package com.yedam.ch0502_02;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Quiz6();
	}

	// 4. for문을 이용해서 주어진 배열의 항목에서 최대값을
	// 구해보세요.
	private static void Quiz4() {

		int[] array = { 1, 5, 3, 8, 2 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
	}

	// 5. 중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균을 구해보세요.
	private static void Quiz5() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double cnt = 0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		avg = sum / cnt;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

	// 6. 다음은 키보드로부터 학생 수와 각 학생 수와 각 학생들의 점수를 입력받아서,
	// 최고 점수 및 평균 점수를 구하는 프로그램입니다.
	// 실행결과를 보고 알맞게 작성해보세요.
	private static void Quiz6() {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] > ");
					scores[i] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] > " + scores[i]);
				}
			} else if (selectNo == 4) {
				System.out.print("최고 점수 : ");
				int max = scores[0];
				int sum = 0;
				double avg;
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
				}

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}

				avg = sum / scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		sc.close();
	}
}