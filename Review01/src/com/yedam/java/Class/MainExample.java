package com.yedam.java.Class;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {
		// 1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다.
		// Lee학생은 2과목을 수강합니다. 국어 점수가 100점, 수학 점수가 50점입니다.
		// Kim학생은 3과목을 수강합니다. 국어 점수가 70점, 수학 점수가 85점, 영어 점수가 100점입니다.
		// Student 클래스와 Subject 클래스를 생성한 후 두 학생의 과목 성적과 총점을 각각 출력해 봅시다.
		String name = null;
		int num = 0;
		Student student = new Student(name, num);
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1. 학생정보 입력 | 2. 학생 조회 | 3. 단건 조회 | 4. 책 대여 | 5. 책 반납 | 6. 인기순위 | 7. 종료 ");
			System.out.println("선택 > ");
			int menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				System.out.println("학생 정보 >");
				name = sc.next();
				num = sc.nextInt();
				student.addStudent(name, num);
				break;
			case 2:
				student.printStudentList();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
