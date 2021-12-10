package com.yedam.java.content2;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "이학생";
		studentLee.setStudentName("이학생");
		
		System.out.println(studentLee.getStudentName());
	}
}
