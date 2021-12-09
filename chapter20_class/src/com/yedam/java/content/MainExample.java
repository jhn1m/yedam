package com.yedam.java.content;

public class MainExample {

	// 아침에 일어난다
	// 씻는다
	// 밥을 먹는다
	// 버스를 탄다
	// 요금을 지불한다
	// 학교에 도착하다

	public static void main(String[] args) {
		
		Student student = new Student();
		student.studentName = "홍길동";
		System.out.println(student.studentName);
		System.out.println(student.getStudentName());
	}

	int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	int getTenTotal() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	void printGreeting(String name) {
		System.out.println(name + "님 안녕하세요!");
	}

}