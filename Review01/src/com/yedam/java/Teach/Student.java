package com.yedam.java.Teach;

public class Student {
	int studentId;
	String studentName;
	Subject[] subjectList;
	static int MAX_SIZE = 3;
	int subjectIndex;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.subjectList = new Subject[MAX_SIZE];
		this.subjectIndex = 0;
	}

	public void addSubject(String subjectName, int scorePoint) {
		if (this.subjectIndex < Student.MAX_SIZE) {
			Subject subject = new Subject();
			subject.setName(subjectName);
			subject.setScorePoint(scorePoint);
			subjectList[subjectIndex++] = subject;
		} else {
			System.out.println("수강과목정보를 더 이상 입력할 수 없습니다.");
		}
	}

	public void showStudentInfo() {
		// 각 수강과목 정보출력
		for (int i = 0; i < subjectIndex; i++) {
			System.out.println("학생 " + this.studentName + "의 " + subjectList[i].getName() + " 과목은 "
					+ subjectList[i].getScorePoint() + "점 입니다.");
		}
		// 각 수강과목 점수의 총합
		int sum = 0;
		for (int i = 0; i < this.subjectIndex; i++) {
			sum += subjectList[i].getScorePoint();
		}
		System.out.println("학생 " + this.studentName + "의 총점은 " + sum + "점 입니다.");
	}

}
