package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.emp13.Emp13;
import com.yedam.app.emp13.Emp13DAOImpl;

public class Emp13Frame {
	// 필드
	Scanner sc = new Scanner(System.in);

	public Emp13Frame() {
		while (true) {
			// 메뉴 출력
			menuPrint();

			// 메뉴 선택
			int menuNo = menuSelect();
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
		System.out.print("선택 >> ");
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
		Emp13 emp13 = inputAll();

		// INSERT
		Emp13DAOImpl.getInstance().insert(emp13);
	}

	void updateEmp() {
		Emp13 emp13 = inputAll();
		Emp13DAOImpl.getInstance().update(emp13);
	}

	void deleteEmp() {
		int employeeId = inputEmpId();
		Emp13DAOImpl.getInstance().delete(employeeId);
	}

	void selectOne() {
		int employeeId = inputEmpId();
		Emp13 emp13 = Emp13DAOImpl.getInstance().selectOne(employeeId);
		if (emp13 == null) {
			System.out.println(employeeId + " : 없는 부서입니다.");
		} else {
			System.out.println(emp13);
		}
	}

	void selectAll() {
		List<Emp13> list = Emp13DAOImpl.getInstance().selectAll();
		for (Emp13 emp13 : list) {
			System.out.println(emp13);
		}
	}

	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	Emp13 inputAll() {
		Emp13 emp13 = new Emp13();
		emp13 = new Emp13();
		System.out.print("사원번호 >> ");
		emp13.setEmployeeId(sc.nextInt());
		System.out.print("이름 >> ");
		emp13.setLastName(sc.next());
		System.out.print("부서 >> ");
		emp13.setJobId(sc.next());
		System.out.print("연봉 >> ");
		emp13.setSalary(sc.nextDouble());
		System.out.print("상여율 >> ");
		emp13.setCommissionPct(sc.nextDouble());

		return emp13;
	}

	int inputEmpId() {
		int employeeId = 0;
		System.out.print("사원번호 >> ");
		employeeId = sc.nextInt();
		return employeeId;
	}
}
