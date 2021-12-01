package com.yedam.java.Class;

public class Student {
	// 필드
	public static int serialNum = 1000;
	int studentNum; // 학번
	String studentName; // 이름
	private int studentCnt;
	private static final int MAX_SIZE = 3; // 수강과목 목록 -> 최대 3과목까지만 가능
	private Subject[] subjectList;
	private Student[] studentList;

	// 생성자
	// 매개변수로 학번과 이름을 받아서 필드를 초기화 함
	public Student(String name, int num) {
		Student.serialNum++;
		this.studentName = name;
		this.studentNum = num;
		this.studentCnt = 0;
		this.subjectList = new Subject[MAX_SIZE];
	}

	// 메소드
	// 수강과목 목록에 저장된 수강과목 수

	// 학생이 가지고 있는 과목정보

	// 학생 등록
	public void addStudent(String name, int num) {
		Student student = new Student(name, num);
		studentList[studentCnt] = student;
		studentCnt++;
		System.out.printf("%s 학생이 입력되었습니다.", name);
	}

	// 학생 조회
	public void printStudentList() {
		for (int i = 0; i < this.studentCnt - 1; i++) {
			System.out.println(studentList[i]);
		}
	}

	// 학생 선택
	public void selectStudent(int num) {
		if (studentCnt <= 0) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		} else {

		}
	}

	// 학생의 과목별 점수 등록
	public void addSubject(Subject subject) {
		for (int i = 0; i < MAX_SIZE; i++) {
			subjectList[i] = subject;
		}
	}

	// 출력형태 1) 학생 홍길동의 수학 과목은 80점입니다.
	// 출력형태 2) 학생 홍길동의 총점은 300점입니다.
	public void showStudentInfo() {

	}
}
