package com.yedam.java.content2;

public class Student {

	// 필드
	// 학번, 이름, 국어점수, 수학점수, 국어과목, 수학과목
	int studentId;
	String studentName;
//	int KoreaScore;
//	int mathScore;
//	String KoreaSubject;
//	String mathSubject;
	// 국어과목정보, 수학과목정보
	Subject korea;
	Subject math;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;	
	}
	
}