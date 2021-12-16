package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.emp.Emp;
import com.yedam.app.emp.EmpDAOImpl;

public class EmpFrame {
	// 필드
	Scanner sc = new Scanner(System.in);

	public EmpFrame() {
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
		EmpDAOImpl.getInstance().insert(emp);
	}

	void updateEmp() {
		Emp emp = inputAll();
		EmpDAOImpl.getInstance().update(emp);
	}

	void deleteEmp() {
		int employeeId = inputEmpId();
		EmpDAOImpl.getInstance().delete(employeeId);
	}

	void selectOne() {
		int employeeId = inputEmpId();
		Emp emp = EmpDAOImpl.getInstance().selectOne(employeeId);
		if (emp == null) {
			System.out.println(employeeId + " : 없는 부서입니다.");
		} else {
			System.out.println(emp);
		}
	}

	void selectAll() {
		List<Emp> list = EmpDAOImpl.getInstance().selectAll();
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}

	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	Emp inputAll() {
		Emp emp = new Emp();
		emp = new Emp();
		System.out.print("사원번호 >> ");
		emp.setEmployeeId(sc.nextInt());
		System.out.print("이름 >> ");
		emp.setLastName(sc.next());
		System.out.println("성 >> ");

		System.out.print("부서명 >> ");
		emp.setJobId(sc.next());
		System.out.print("연봉 >> ");
		emp.setSalary(sc.nextDouble());
		System.out.print("상여율 >> ");
		emp.setCommissionPct(sc.nextDouble());
		System.out.print("부서아이디 >> ");
		emp.setDepartmentId(sc.nextInt());

		return emp;
	}

	int inputEmpId() {
		int employeeId = 0;
		System.out.print("사원번호 >> ");
		employeeId = sc.nextInt();
		return employeeId;
	}

}
