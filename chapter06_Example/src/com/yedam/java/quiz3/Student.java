package com.yedam.java.quiz3;

public class Student {

	// 필드
	private static int serialNum = 1000; // 학번을 위한 기준점

	private int studentID;// 학번 (인스턴스별로 값을 가지는게 아니라 클래스별로 값을 가지는 정적 멤버를 가질 수 있음)
	private String studentName;// 학생이름
	private int grade;// 학년
	private int address;// 주소
	private int cardNumber; // 카드 번호
	// 생성자

	public Student() {
		Student.serialNum++;
		this.studentID = serialNum;
		this.cardNumber = serialNum + 100;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	// 메소드

}
