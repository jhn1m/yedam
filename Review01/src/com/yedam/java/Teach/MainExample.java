package com.yedam.java.Teach;

public class MainExample {
	public static void main(String[] args) {
		Student lee = new Student(1001, "Lee");
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 50);
		lee.showStudentInfo();

		System.out.println();

		Student kim = new Student(1002, "Kim");
		kim.addSubject("국어", 70);
		kim.addSubject("수학", 85);
		kim.addSubject("영어", 100);
		kim.showStudentInfo();
	}
}
