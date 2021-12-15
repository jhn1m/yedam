package com.yedam.java.app02;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.app01.Employee;

public class DeptApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		DeptDAO dao = DeptDAO.getInstance();
		Dept dept = null;
		int departmentId = 0;

		while (run) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("| 1. 등록 | 2. 수정 | 3. 삭제 | 4. 부서조회 | 5. 전체조회 | 9. 종료 |");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("선택 >> ");
			int menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				dept = new Dept();
				System.out.print("부서아이디 >> ");
				dept.setDepartmentId(sc.nextInt());
				System.out.print("부서이름 >> ");
				dept.setDepartmentName(sc.next());
				System.out.print("매니저 >> ");
				dept.setLastName(sc.next());
				System.out.print("도시 >> ");
				dept.setCity(sc.next());

				dao.insert(dept);

				break;
			case 2:
				dept = new Dept();
				System.out.print("수정하려는 부서 >> ");
				dept.setDepartmentId(sc.nextInt());
				System.out.print("매니저 이름? >> ");
				dept.setLastName(sc.next());

				dao.update(dept);
				break;
			case 3:
				System.out.print("삭제하려는 부서아이디 >> ");
				dao.delete(sc.nextInt());
				break;
			case 4:
				System.out.print("조회하려는 부서아이디 >> ");
				System.out.println(dao.selectOne(sc.nextInt()));
				break;
			case 5:
				System.out.print("모든 데이터를 조회합니다.");
				List<Dept> list = dao.selectAll();
				for (Dept department : list) {
					System.out.println(department);
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
