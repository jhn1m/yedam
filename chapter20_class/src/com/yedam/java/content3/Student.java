package com.yedam.java.content3;

public class Student {
	private static String school;
	private static int serialNum = 1000;
	private int studentId;
	private String studentName;

	Student() {
		serialNum++;
		studentId = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static void main(String[] args) {
		System.out.println(Student.school);
		System.out.println(Student.getSerialNum());
	}

}
