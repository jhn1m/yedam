package com.yedam.java.content3;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student();
		lee.setStudentName("홍길동");
		Student kim = new Student();
		kim.setStudentName("김학생");

		Student aa = new Student();
		Student bb = new Student();

//		kim.school = "예담";
//		System.out.println(lee.school);

		System.out.println(lee.getStudentId());
		System.out.println(kim.getStudentId());
		System.out.println(Student.getSerialNum());
		
		
	}

}
