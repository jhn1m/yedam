package com.yedam.java.content;

public class Student {
	// 속성 > 필드
	int studentId; // 학번
	String studentName; // 이름
	int grade; // 학년
	String address; // 주소

	// 메서드
	public void showStudentInfo() {
		System.out.println("studentName" + ", " + address);
	}

	String getStudentName() {
		return studentName;
	}
	
	void setStudentName(String name){
		studentName = name;
	}
	
}
