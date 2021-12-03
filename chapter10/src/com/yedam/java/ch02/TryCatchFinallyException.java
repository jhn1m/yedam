package com.yedam.java.ch02;

public class TryCatchFinallyException {

	public static void main(String[] args) {
		try {
			// 실제로 실행되어야 하는 코드
		} catch (Exception e) {
			// 예외가 발생했을 때 처리하는 코드
		} finally {
			// (생락가능)실제로 실행이 되었든,
			// 예외가 발생했든 반드시 실행되어야 하는 코드.
		}

		// 일반 예외 처리

		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

		// 실행 예외 처리
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
//			return; 
			// return을 만났기 때문에 밑의 try문이 실행되지 않는다.
		}

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;

			System.out.printf("%d + %d = %d\n", value1, value2, result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}
		System.out.println();

		// 다중 catch
		// 순서대로 에러를 잡기 때문에 catch의 순서가 중요하다
		try {
			String data3 = args[0];
			String data4 = args[1];

			int value3 = Integer.parseInt(data3);
			int value4 = Integer.parseInt(data4);
			int result = value3 + value4;
			System.out.printf("%d + %d = %d\n", value3, value4, result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

		// catch블록 순서
		try {
			String data3 = args[0];
			String data4 = args[1];

			int value3 = Integer.parseInt(data3);
			int value4 = Integer.parseInt(data4);
			int result = value3 + value4;
			System.out.printf("%d + %d = %d\n", value3, value4, result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (Exception e) { // Exception클래스가 최상위 클래스라 젤 앞에쓰면
								// 다른 예외클래스들이 오류남
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}