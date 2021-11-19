package com.yedam.ch0502_02;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReferenceTypeExample {

	public static void main(String[] args) {
//		if(args.length != 2) {
//			System.out.println("값의 수가 부족합니다.");
//			System.exit(0);
//		}
//		String strNum1 = args[0];
//		String strNum2 = args[1];
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		
//		int result = num1 + num2;
//		System.out.println(num1 + " + " + num2 + "=" + result);

//		int[][] mathScores = new int[2][3];
		// mathScores[0] = int[3], mathScores[1] = int[3]
//		for (int i = 0; i < mathScores.length; i++) {
//			int[] temp = mathScores[i];
//			for(int k = 0; k < temp.length; k++) {
//				int value = temp[k];
//			}
//			for (int k = 0; k < mathScores[i].length; k++) {
//				System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
//			}
//		}
//		System.out.println();
//		int[][] englishScores = new int[2][];
//		englishScores[0] = new int[2];
//		englishScores[1] = new int[3];
//		for (int i = 0; i < englishScores.length; i++) {
//			for (int k = 0; k < englishScores[i].length; k++) {
//				System.out.println("englishScores[" + i + "][" + k + "]");
//			}
//		}

		System.out.println();
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] :" + englishScores[i][k]);
			}
		}
		System.out.println();
		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 }, { 100 } };
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores[" + i + "][" + j + "] : " + javaScores[i][j]);
			}
		}

		// 객체를 참조하는 배열
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]); // true
		System.out.println(strArray[0] == strArray[2]); // false
		System.out.println(strArray[0].equals(strArray[2])); // true

		// for 문으로 배열 복사

		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		// newIntArray > {1, 2, 3, 0, 0}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}

		// System.arraycopy() 로 배열복사
		String[] oldStrArray = { "Java", "Array", "Copy" };
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 2, oldStrArray.length);

		for (String str : newStrArray) {
			System.out.println(str);
		}

		// 향상된 for문
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 = " + sum);
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}
