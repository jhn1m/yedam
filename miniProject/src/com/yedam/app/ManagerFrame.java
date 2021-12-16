package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.app.manager.Manager;
import com.yedam.java.app.manager.ManagerDAOImpl;

public class ManagerFrame {
	Scanner sc = new Scanner(System.in);

	public ManagerFrame() {
		while (true) {
			// 메뉴 출력
			menuPrint();

			// 메뉴 선택
			int menuNo = menuSelect();
			if (menuNo == 1) {
				insertManager();
			} else if (menuNo == 2) {
				updateManager();
			} else if (menuNo == 3) {
				deleteManager();
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
		System.out.println("| 1. 등록 | 2. 수정 | 3. 삭제 | 4. 개별조회 | 5. 전체조회 | 9. 종료 |");
		System.out.println("---------------------------------------------------------------------");
		System.out.print("선택 >> ");
	}

	void updateMenuPrint() {
		System.out.println("----------------------------------------------");
		System.out.println("수정을 선택하셨습니다. 수정 메뉴를 선택하세요.");
		System.out.println("----------------------------------------------\n");
		System.out.println("-------------------------------------------------------------");
		System.out.println("| 1. 전체수정 | 2. 이름만 수정 | 3. 비밀번호 수정 | 9. 취소 |");
		System.out.println("-------------------------------------------------------------");
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

	void insertManager() {
		// 값을 입력받아야 함
		Manager manager = inputAll();

		// INSERT
		ManagerDAOImpl.getInstance().insert(manager);
	}

	void updateManager() {
		updateMenuPrint();
		int menuNo = menuSelect();
		if (menuNo == 1) {
			updateAllManager();
		} else if (menuNo == 2) {
			updateNameManager();
		} else if (menuNo == 3) {
			updatePwdManager();
		} else if (menuNo == 9) {
			cancle();
			return;
		}
	}

	void updateAllManager() {
		Manager manager = inputAll();
		ManagerDAOImpl.getInstance().updateAll(manager);
	}

	void updateNameManager() {
		Manager manager = inputForName();
		ManagerDAOImpl.getInstance().updateName(manager);
	}

	void updatePwdManager() {
		Manager manager = inputForPwd();
		ManagerDAOImpl.getInstance().updatePwd(manager);
	}

	void deleteManager() {
		int managerId = inputManagerId();
		ManagerDAOImpl.getInstance().delete(managerId);
	}

	void selectOne() {
		int managerId = inputManagerId();
		Manager manager = ManagerDAOImpl.getInstance().selectOne(managerId);
		if (manager == null) {
			System.out.println(managerId + " : 없는 부서입니다.");
		} else {
			System.out.println(manager);
		}
	}

	void selectAll() {
		List<Manager> list = ManagerDAOImpl.getInstance().selectAll();
		for (Manager manager : list) {
			System.out.println(manager);
		}
	}

	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	void cancle() {
		System.out.println("취소합니다.");
	}

	Manager inputAll() {
		Manager manager = new Manager();
		manager = new Manager();

		System.out.print("매니저 번호 >> ");
		manager.setManagerId(sc.nextInt());

		System.out.print("매니저 이름 >> ");
		manager.setManagerName(sc.next());

		System.out.print("매니저 비밀번호 >> ");
		manager.setManagerPwd(sc.next());

		return manager;
	}

	Manager inputForName() {
		Manager manager = new Manager();
		manager = new Manager();
		System.out.println("매니저 번호 >> ");
		manager.setManagerId(sc.nextInt());
		System.out.println("변경할 이름 >> ");
		manager.setManagerName(sc.next());
		return manager;
	}

	Manager inputForPwd() {
		Manager manager = new Manager();
		System.out.println("매니저 번호 >> ");
		manager.setManagerId(sc.nextInt());
		System.out.println("변경할 비밀번호 >> ");
		manager.setManagerPwd(sc.next());
		return manager;
	}

	int inputManagerId() {
		int managerId = 0;
		System.out.print("매니저 번호>> ");
		managerId = sc.nextInt();
		return managerId;
	}
}
