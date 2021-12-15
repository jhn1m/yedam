package com.yedam.java.app03;

import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		EmpDAO dao = EmpDAO.getInstance();
		Emp emp = null;
		int employeeId = 0;

		while (run) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("| 1. 등록 | 2. 수정 | 3. 삭제 | 4. 선택조회 | 5. 전체조회 | 9. 종료 |");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("선택 >> ");
			int menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				emp = new Emp();
				System.out.print("사원번호 >> ");
				emp.setEmployeeId(sc.nextInt());
				System.out.print("사원이름 >> ");
				emp.setLastName(sc.next());
				System.out.print("부서명 >> ");
				emp.setJobId(sc.next());
				System.out.print("연봉 >> ");
				emp.setSalary(sc.nextDouble());
				System.out.print("상여율 >> ");
				emp.setCommissionPct(sc.nextDouble());
				System.out.print("부서아이디 >> ");
				emp.setDepartmentId(sc.nextInt());

				dao.insert(emp);

				break;
			case 2:
				emp = new Emp();
				System.out.print("수정하려는 사원 >> ");
				emp.setEmployeeId(sc.nextInt());
				System.out.print("연봉? >> ");
				emp.setSalary(sc.nextDouble());
				dao.update(emp);
				break;
			case 3:
				System.out.print("삭제하려는 부서아이디 >> ");
				dao.delete(sc.nextInt());
				break;
			case 4:
				System.out.print("조회하려는 부서아이디 >> ");
				emp = dao.selectOne(sc.nextInt());
				if (emp.getEmployeeId() != 0) {
					System.out.println(dao.selectOne(sc.nextInt()));
				} else {
					System.out.println("EMPTY");
				}
				break;
			case 5:
				System.out.printf("모든 데이터를 조회합니다. \n");
				List<Emp> list = dao.selectAll();
				for (Emp employees : list) {
					System.out.println(employees);
				}
				break;

			case 9:
				run = false;
				sc.close();
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
}
