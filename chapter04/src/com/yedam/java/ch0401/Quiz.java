package com.yedam.java.ch0401;

public class Quiz {

	public static void main(String[] args) {
		Quiz5();
	}

	// 문제1)
	// 두 개의 정수가 주어졌을 때 두 정수의 합이 자연수이면 'Natural Number'을 출력하도록 하세요.
	private static void Quiz1() {
		int a = 1;
		int b = 2;
		if ((a + b) > 0) {
			System.out.println("Natural Number");
		}
	}

	// 문제2)
	// 두 개의 정수가 주어졌을 때 두 수의 대소관계에 따라 부등호( > or = or < )를 출력하도록 하세요.
	private static void Quiz2() {
		int a = 1;
		int b = 2;
		if (a > b) {
			System.out.println(">");
		} else if (a == b) {
			System.out.println("=");
		} else if (a < b) {
			System.out.println("<");
		}
	}

	// 문제3)
	// 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분하여 결과값을 출력하도록 하세요.
	// 저체중(18.5미만), 정상(18.5 이상 25미만), 과체중(25이상 30미만), 비만(30이상)
	// BMI = 체중 / ( 키 * 키 )

	private static void Quiz3() {
		double weight, height;
		weight = 80;
		height = 1.8;
		double bmi = height / (weight * weight);
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("정상");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("과체중");
		} else
			System.out.println("비만");
	}

	// 문제4)
	// 선택한 단의 6번째 값을 출력하도록 하세요.
	// 예를 들어, 2단일 경우 2 X 6 = 12
	// 단, 출력문에 변수를 사용하지 않는다.

	private static void Quiz4() {

//		int value_t = 1;
//		value_t *= 6;
//		System.out.println();

		int value = 1;

		switch (value) {
		case 1:
			value *= 6;
			System.out.println("1 X 6 = " + value);
			break;
		case 2:
			value *= 6;
			System.out.println("2 X 6 = " + value);
			break;
		case 3:
			value *= 6;
			System.out.println("3 X 6 = " + value);
			break;
		case 4:
			value *= 6;
			System.out.println("4 X 6 = " + value);
			break;
		case 5:
			value *= 6;
			System.out.println("5 X 6 = " + value);
			break;
		case 6:
			value *= 6;
			System.out.println("6 X 6 = " + value);
			break;
		case 7:
			value *= 6;
			System.out.println("7 X 6 = " + value);
			break;
		case 8:
			value *= 6;
			System.out.println("8 X 6 = " + value);
			break;
		case 9:
			value *= 6;
			System.out.println("9 X 6 = " + value);
			break;
		default:
			System.out.println("잘 못 입력했습니다.");
			break;
		}
	}

	// 문제5)
	// 다음과 같이 점수 범위에 따라 등급을 구분하여 해당 점수에 대한 등급을 출력하도록 하세요.
	// 90점 이상 100점 이하 : A 등급,
	// 80점 이상 90점미만 : B 등급,
	// 70점 이상 80점미만 : C 등급,
	// 60점 이상 70점미만 : D 등급,
	// 60점미만 : E등급

	private static void Quiz5() {
		int score = 100;
		if (score >= 90 && score <= 100) {
			System.out.println("A 등급");
		} else if (score >= 80 && score < 90) {
			System.out.println("B 등급");
		} else if (score >= 70 && score < 80) {
			System.out.println("C 등급");
		} else if (score >= 60 && score < 70) {
			System.out.println("D 등급");
		} else {
			System.out.println("E 등급");
		}
	}

}
