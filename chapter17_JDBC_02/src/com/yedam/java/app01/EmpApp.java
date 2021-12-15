package com.yedam.java.app01;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		// DAO
		EmpDAO dao = EmpDAO.getInstance();
		Employee emp = null;
		int employeeId = 0;

		while (run) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("| 1. 등록 | 2. 수정 | 3. 삭제 | 4. 사원조회 | 5. 전체조회 | 9. 종료 |");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("선택 >> ");
			int menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				emp = new Employee();
				System.out.print("사번 >> ");
				emp.setEmployeeId(sc.nextInt());
				System.out.print("이름 >> ");
				emp.setFirstName(sc.next());
				System.out.print("성 >> ");
				emp.setLastName(sc.next());
				System.out.print("이메일 >> ");
				emp.setEmail(sc.next());
				System.out.print("전화번호 >> ");
				emp.setPhoneNumber(sc.next());
				System.out.print("입사일 >> ");
				// 데이트타입 변환주의
				emp.setHireDate(Date.valueOf(sc.next()));
				System.out.print("직급 >> ");
				emp.setJobId(sc.next());
				System.out.print("연봉 >> ");
				emp.setSalary(sc.nextDouble());
				System.out.print("상여 >> ");
				emp.setCommissionPct(sc.nextDouble());
				System.out.print("상사 아이디 >> ");
				emp.setManagerId(sc.nextInt());
				System.out.print("부서번호 >> ");
				emp.setDepartmentId(sc.nextInt());

				dao.insert(emp);

				break;
			case 2:
				emp = new Employee();
				System.out.print("수정하려는 사번 >> ");
				emp.setEmployeeId(sc.nextInt());
				System.out.print("연봉을 얼마로 수정할까요? >> ");
				emp.setSalary(sc.nextDouble());

				dao.update(emp);
				break;
			case 3:
				System.out.print("삭제하려는 사번 >> ");
				emp = dao.selectOne(sc.nextInt());
				System.out.println(emp);
				break;
			case 4:
				System.out.print("조회하려는 사번 >> ");
				emp = dao.selectOne(sc.nextInt());
				System.out.println(emp);
				break;
			case 5:
				List<Employee> list = dao.selectAll();
				for (Employee employee : list) {
					System.out.println(employee);
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