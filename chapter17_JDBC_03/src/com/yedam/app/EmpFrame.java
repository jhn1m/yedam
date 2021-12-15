package com.yedam.app;

import java.util.Scanner;

import com.yedam.app.emp.Emp;

public class EmpFrame {
	// 필드
	Scanner sc = new Scanner(System.in);

	public EmpFrame() {
		while (true) {
			// 메뉴 출력
			menuPrint();

			// 메뉴 선택
			int menuNum = menuSelect();
			if (menuNo == 1) {
				insertEmp();
			} else if (menuNo == 2) {
				updateEmp();
			} else if (menuNo == 3) {
				deleteEmp();
			} else if (menuNo == 4) {
				selectOne();
			} else if (menuNo == 5) {
				selectAll();
			} else if (menuNo == 9) {
				end();
				break;
			}
		}
	}

	void menuPrint() {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("| 1. 등록 | 2. 수정 | 3. 삭제 | 4. 사원조회 | 5. 전체조회 | 9. 종료 |");
		System.out.println("---------------------------------------------------------------------");
		System.out.print("선택 >>");
	}

	int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = sc.nextInt();
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	void insertEmp() {
		// 값을 입력받아야 함
		Emp emp = inputAll();
		
		// INSERT
		EmpDAOImpl
	}

}
