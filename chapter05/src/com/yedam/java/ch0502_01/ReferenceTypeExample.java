package com.yedam.java.ch0502_01;

import java.util.Arrays;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		System.out.println("##### 배열 선언 #####\n");
		int[] intArray;
		double[] doubleArray;
		String[] StringArray;

		System.out.println("##### 배열 생성 #####");
		System.out.println("##### 1. 값 목록으로 초기화 #####\n");
		int[] scores = { 83, 90, 87 };
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		System.out.println("\n##### 2. 총합, 평균 #####\n");

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);

		System.out.println("\n##### new연산자 + 값 목록으로 초기화 #####\n");
		int[] scores1;
		scores1 = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores1[i];
		}
		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 80, 90, 100 });

		System.out.println("\n##### new 연산자 #####\n");
		int[] arr1 = new int[3];
		System.out.println("##### 값 넣기 전 #####\n");
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		System.out.println("\n##### 값 넣은 후 #####\n");

		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}

		System.out.println("##### double형 #####");
		System.out.println("##### 값 넣기 전 #####\n");
		double[] arr2 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		System.out.println("\n##### 값 넣은 후 #####\n");
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println("\n##### String형 #####");
		System.out.println("##### 값 넣기 전 #####\n");
		String[] arr3 = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr3[i]);
		}

		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		System.out.println("\n##### 값 넣은 후 #####\n");
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr3[i]);
		}

		System.out.println("\n##### 배열 크기 : length #####\n");
		int[] scores3 = {83, 90, 87};
		int sum3 = 0;
		for(int i = 0; i <scores3.length; i++) {
			sum += scores3[i];
		}
		System.out.println("총합 : " + sum3);
		double avg3 = (double)sum / scores3.length;
		System.out.println("평균 : " + avg);
	}

	public static int add(int[] scores) {
		System.out.println("\n##### 메소드화  #####\n");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
